import org.junit.Test;

import static org.fest.assertions.api.Assertions.assertThat;

public class IPAddressesTest {

    @Test
    public void given_same_ips_should_return_1() {
        assertThat(IPAddresses.number_of_ips_in_range("10.110.1.1", "10.110.1.1")).isEqualTo("1");
    }

    @Test
    public void given_two_ips_within_a_range_of_50_should_return_50() {
        assertThat(IPAddresses.number_of_ips_in_range("10.110.1.1", "10.110.1.50")).isEqualTo("50");
    }

    @Test
    public void given_two_ips_within_a_range_of_257_should_return_257() {
        assertThat(IPAddresses.number_of_ips_in_range("10.110.0.0", "10.110.1.0")).isEqualTo("257");
    }

    @Test
    public void given_two_ips_within_a_range_of_65537_should_return_65537() {
        assertThat(IPAddresses.number_of_ips_in_range("10.0.0.0", "10.1.0.0")).isEqualTo("65537");
    }

    @Test
    public void given_two_ips_within_a_range_of_16777217_should_return_16777217() {
        assertThat(IPAddresses.number_of_ips_in_range("0.0.0.0", "1.0.0.0")).isEqualTo("16777217");
    }

    @Test
    public void given_two_ips_within_a_range_of_129_should_return_129() {
        assertThat(IPAddresses.number_of_ips_in_range("0.0.0.128", "0.0.1.0")).isEqualTo("129");
    }

    @Test
    public void given_two_ips_within_a_range_of_98305_should_return_98305() {
        assertThat(IPAddresses.number_of_ips_in_range("0.0.0.128", "0.1.128.128")).isEqualTo("98305");
    }
}
