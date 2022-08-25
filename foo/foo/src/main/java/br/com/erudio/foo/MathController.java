package br.com.erudio.foo;

import java.net.Authenticator.RequestorType;
import java.util.concurrent.atomic.AtomicLong;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import br.com.erudio.exception.UnsuportedMath;

@RestController
public class MathController {
	
	@RequestMapping(value="/sum/{n1}/{n2}", method=RequestMethod.GET)
	public Double sum(@PathVariable("n1") String n1, @PathVariable("n2") String n2) throws Exception{
		if(Double.parseDouble(n1)>Double.parseDouble(n2) ) {
			System.out.println();
			throw new UnsuportedMath("BRasil");
		}
		return 1D;
		
	}
}
