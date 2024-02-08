package UnitTest;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.ArrayList;
import java.util.List;

@Data
@AllArgsConstructor
public class Book {
    private Long id;
    private String title;
    private String author;
    private double price;
    public void validateValue(double price){
        if(price<1){
            throw  new RuntimeException("There is exception");
        }else {
            System.out.println("this is valid method");
        }
    }
    public List<String> getBookList(){
        List<String> list = new ArrayList<>();
        list.add("React");
        list.add("javascript");
        return list;
    }
}
