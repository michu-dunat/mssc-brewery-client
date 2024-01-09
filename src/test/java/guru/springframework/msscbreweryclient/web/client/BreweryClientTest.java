package guru.springframework.msscbreweryclient.web.client;

import java.net.URI;
import java.util.UUID;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import guru.springframework.msscbreweryclient.web.model.BeerDto;
import guru.springframework.msscbreweryclient.web.model.CustomerDto;

import static org.junit.jupiter.api.Assertions.assertNotNull;

@SpringBootTest
class BreweryClientTest
{

    @Autowired
    BreweryClient client;

    @Test
    void testGetBeerById()
    {
        //given
        UUID uuid = UUID.randomUUID();

        //when
        BeerDto dto = client.getBeerById(uuid);

        //then
        assertNotNull(dto);
    }

    @Test
    void testSaveNewBeer()
    {
        //given
        BeerDto beerDto = BeerDto.builder().beerName("New Beer").build();

        //when
        URI uri = client.saveNewBeer(beerDto);

        //then
        assertNotNull(uri);
    }

    @Test
    void testUpdateBeer()
    {
        //given
        BeerDto beerDto = BeerDto.builder().beerName("New Beer").build();

        //when
        client.updateBeer(UUID.randomUUID(), beerDto);

        //then
    }

    @Test
    void testDeleteBeer()
    {
        //given
        UUID uuid = UUID.randomUUID();

        //when
        client.deleteBeer(uuid);

        //then
    }

    @Test
    void getCustomerById()
    {
        //given
        UUID uuid = UUID.randomUUID();

        //when
        CustomerDto customerDto = client.getCustomerById(uuid);

        //then
        assertNotNull(customerDto);
    }

    @Test
    void saveNewCustomer()
    {
        //given
        CustomerDto customerDto = CustomerDto.builder().name("John Smith").build();

        //when
        URI uri = client.saveNewCustomer(customerDto);

        //then
        assertNotNull(uri);
    }

    @Test
    void updateCustomer()
    {
        //given
        UUID uuid = UUID.randomUUID();
        CustomerDto customerDto = CustomerDto.builder().name("John Smith").build();

        //when
        client.updateCustomer(uuid, customerDto);

        //then
    }

    @Test
    void deleteCustomer()
    {
        //given
        UUID uuid = UUID.randomUUID();

        //when
        client.deleteCustomer(uuid);

        //then
    }
}