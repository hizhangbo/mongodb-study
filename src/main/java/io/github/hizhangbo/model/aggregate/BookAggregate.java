package io.github.hizhangbo.model.aggregate;

import lombok.AllArgsConstructor;
import lombok.Data;
import org.springframework.data.annotation.Id;

import java.util.List;

/**
 * @author Bob
 * @date 2020-03-03 14:03
 */
@Data
@AllArgsConstructor
public class BookAggregate {
    @Id
    private String publisher;
    private List<String> classify;
}