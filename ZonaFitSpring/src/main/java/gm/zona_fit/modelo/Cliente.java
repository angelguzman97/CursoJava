package gm.zona_fit.modelo;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.*;

@Entity //Marca que es una identidad
@Data //Genera encapsulamiento (Get y Set)
@NoArgsConstructor //Constructor vacío
@AllArgsConstructor //Constructor con todos los parámetros
@ToString //Método ToString()
@EqualsAndHashCode //Método Equals() y HasCode()
public class Cliente {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String nombre;
    private String apellido;
    private Integer membresia;

}
