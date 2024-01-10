package jenkins.test.service;

import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.Mockito.when;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@ExtendWith(MockitoExtension.class)
class SumTest {

//    @Mock
//    private SumServiceInterface sumServiceInterface;

    private Logger logger = LoggerFactory.getLogger(this.getClass());
    

//    @InjectMocks
//    private SumServiceImpl sumServiceImpl;

    @Test
    void testSum() {
    	
        // Cấu hình mock trước khi gọi phương thức
//        when(sumServiceInterface.Sum(2, 3)).thenReturn(5);
    	 SumServiceInterface sumService = new SumServiceImpl();

        // Act
        int result = sumService.Sum(2, 3);

        // Assert
        assertThat(result).isEqualTo(5);

    }
    @Test
    void testSub() {
    	 SumServiceInterface sumService = new SumServiceImpl();
        // Cấu hình mock trước khi gọi phương thức
//        when(sumServiceInterface.Sub(5, 2)).thenReturn(3);

        // Act
        int result = sumService.Sub(5, 2);

        // Assert
        assertThat(result).isEqualTo(3);

    }
    
}
