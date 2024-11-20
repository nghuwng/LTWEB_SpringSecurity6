package hungvt.models;

import lombok.Data;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.ToString;
import lombok.Builder;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Builder
public class CustomerModel {
    private String id;
    private String name;
    private String phoneNumber;
    private String email;
}

