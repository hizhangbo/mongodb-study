package io.github.hizhangbo.repository;

import io.github.hizhangbo.model.Book;
import io.github.hizhangbo.model.aggregate.BookAggregate;
import io.github.hizhangbo.model.aggregate.util.SumValue;
import org.springframework.data.domain.Sort;
import org.springframework.data.mongodb.repository.Aggregation;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @author Bob
 * @date 2020-03-03 13:00
 */
@Repository
public interface BookRepo extends MongoRepository<Book, String> {

    @Query("{ 'publisher' : ?0 }")
    List<Book> findByPublisher(String publisher);



    @Aggregation("{ $group: { _id : $publisher, classify : { $addToSet : $classify } } }")
    List<BookAggregate> groupByPublisherAndClassify(Sort sort);



    @Aggregation("{ $group : { _id : null, total : { $sum : $age } } }")
    SumValue sumAgeUsingValueWrapper();
}
