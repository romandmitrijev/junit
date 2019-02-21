package real.stock;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.runners.MockitoJUnitRunner;

import static org.junit.Assert.*;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

@RunWith(MockitoJUnitRunner.class)
public class PortfolioTest {

    Portfolio portfolio;
    StockService stockService;

    @Before
    public void setUp() throws Exception {
        portfolio = new Portfolio();
        stockService = mock(StockService.class);
        portfolio.setStockService(stockService);
    }

    @Test
    public void testGetPriceWhenQuantity10ThenReturn50() {
        Stock googleStock = new Stock("1", "Google", 10);
        when(stockService.getPrice(googleStock)).thenReturn(50.00);
    }

    @Test
    public void testGetPriceWhenQuantity100ThenReturn1000() {
        Stock microsoftStock = new Stock("2", "Microsoft", 100);
        when(stockService.getPrice(microsoftStock)).thenReturn(1000.00);
    }
}