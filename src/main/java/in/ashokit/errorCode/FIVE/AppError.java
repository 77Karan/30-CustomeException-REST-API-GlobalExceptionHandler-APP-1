package in.ashokit.errorCode.FIVE;

import java.util.Date;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
@Data
@AllArgsConstructor
@NoArgsConstructor
public class AppError 
{
	private Integer errorCode;
	private String errorDesc;
	private Date date;

}
