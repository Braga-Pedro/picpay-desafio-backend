package picpay.challenge.spring.domain.users;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;

@Entity // define classe como entidade (model)
@Table(name = "users") // define tabela no banco dessa classe
@Getter // gera automaticamente os getters
@Setter // gera automaticamente os setters
@AllArgsConstructor // constructor que recebe todos os parametros da classes
@EqualsAndHashCode(of="id") // gera o id de forma automatica
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) // gera o id de forma incremetal (i++)
    private Long id;
    // name: [string(50), not null]
    private String name;
    // email: [string(150), unique, not null]
    @Column(unique = true)
    private String email;
    // password: [string(100), not null]
    private String password;
    // document: [string(40), unique, not null]
    @Column(unique = true)
    private String document;
    // level: [enum[seller, common]] | criar Enum Level
    public enum Level { // criar classe type com method public enum Level
        SELLER, COMMOM
    }
    @Enumerated(EnumType.STRING)
    private Level level;

    private LocalDateTime created_at;

    private LocalDateTime updated_at;
    // deleted_at:
    private LocalDateTime deleted_at;

}