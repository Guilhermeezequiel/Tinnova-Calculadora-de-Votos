package Calculator;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

import org.junit.jupiter.api.Test;

class VoteCalculatorTest {

    @Test
    void calculateValidVotes() {
        VoteCalculator calculator = new VoteCalculator();
        final Double expectedPercentage = 80.0D;
        final Double validVotes = calculator.calculateValidVotes();
        assertThat(validVotes).isEqualTo(expectedPercentage);
    }

    @Test
    void calculateBlankVotes() {
        final Double expectedPercentage = 15.0D;
        VoteCalculator calculator = new VoteCalculator();
        final Double blankVotes = calculator.calculateBlankVotes();
        assertThat(blankVotes).isEqualTo(expectedPercentage);
    }

    @Test
    void calculateInvalidVotes() {
        VoteCalculator calculator = new VoteCalculator();
        final Double expectedPercentage = 5.0D;
        final Double invalidVotes = calculator.calculateInvalidVotes();
        assertThat(invalidVotes).isEqualTo(expectedPercentage);
    }

}