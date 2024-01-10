package jenkins.test.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

public interface SumServiceInterface {
	int Sum(int a, int b);
	int Sub(int a ,int b);

}

@Service
class SumServiceImpl implements SumServiceInterface {
	Logger logger = LoggerFactory.getLogger(this.getClass());

	
	public int Sum(int a, int b) {
		int c = a + b;
		return c;
	}
	public int Sub(int a, int b) {
		int c = a - b;
		return c;
	}

}
