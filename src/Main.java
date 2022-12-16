import enums.Gender;
import enums.Genre;
import enums.Language;
import model.Book;
import model.User;
import service.ServiceAble.UserServiceAble;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.Year;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        // Бардык Id лер уникальный болуш керек. Эгер уникальный болбосо озубуз тузгон UniqueConstraintException класс ыргытсын.
        // User дин email адресси уникальный болуш керек жана @ болуусу керек. Эгер уникальный болбосо UniqueConstraintException класс,
        // @ болбосо озубуз тузгон BadRequestException класс ыргытсын.
        // User дин телефон номери +996 дан башталып 13 символдон турсун. Болбосо BadRequestException класс ыргытсын.
        // Китептин баасы терс сан болбошу керек. Болбосо NegativeNumberException ыргытсын.
        // Китептин чыккан жылы келечек убакыт болбошу керек.Болбосо DateTimeException ыргытсын.
        // Китептин автору бош болбошу керек. Болбосо EmptyStackException ыргытсын.
        //    private Long id;
//    private String name;
//    private String surname;
//    private String email;
//    private String phoneNumber;
//    private Gender gender;
//    private BigDecimal money;
//    private List<Book> books;
        User user = new User(1L,"Baiysh","Orozaliev","Baiysh@gmail.com","996552930920", Gender.MALE,new BigDecimal(1000),new ArrayList<>());
        User user2 = new User(2L,"Aygul","jenishov","Aygul@gmail.com","996553568499", Gender.FEMALE,new BigDecimal(1000),new ArrayList<>());
        User user3 = new User(3L,"Keldibek","Keldibekov","Keldibek@gmail.com","996551982344", Gender.MALE,new BigDecimal(1000),new ArrayList<>());
        User user4 = new User(4L,"Kurstan","Kurstanov","Kurstan@gmail.com","996552778899", Gender.MALE,new BigDecimal(1000),new ArrayList<>());
        User user5 = new User(5L,"Begimay","Syimykov","Begimay@gmail.com","996552998822", Gender.FEMALE,new BigDecimal(1000),new ArrayList<>());

        Book book = new Book(1L,"Syngan Kylych", Genre.HISTORICAL,new BigDecimal(200),"Tologon Kasymbekov", Language.KYRGYZ, LocalDate.of(1997,10,23));
        Book book2 = new Book(2L,"Richest Man", Genre.HISTORICAL,new BigDecimal(200),"George Samuel Clason", Language.KYRGYZ, LocalDate.of(1997,10,23));
        Book book3 = new Book(3L,"book1", Genre.HISTORICAL,new BigDecimal(200),"bok1 aouthor", Language.KYRGYZ, LocalDate.of(1997,10,23));
        Book book4 = new Book(4L,"book2 ", Genre.HISTORICAL,new BigDecimal(200),"aouthor book2", Language.KYRGYZ, LocalDate.of(1997,10,23));

        UserServiceAble userServiceAble = new UserServiceAble();

        List<User> users = new ArrayList<>(Arrays.asList(user,user2,user3,user4,user5));

        userServiceAble.updateUser(2L);


    }
}