package in.ashokit.binding.handler.SIX;

import java.util.Date;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestController;

import in.ashokit.binding.CustomeException.THREE.NoProductFoundException;
import in.ashokit.errorCode.FIVE.AppError;

@RestController
@ControllerAdvice
public class MyExceptionHandler 
{
	@ExceptionHandler(value=NoProductFoundException.class)
	public ResponseEntity<AppError> handleNoProductFoundException()
	{
		AppError ap = new AppError(777,"Infra Problem Try later",new Date());
		return new ResponseEntity<AppError>(ap,HttpStatus.BAD_REQUEST);
	}

}
