import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import ru.netologu.Radio.Radio;


public class RadioTest {

    @Test
    public void shouldSetCurrentChannel() {
        Radio rad = new Radio();

        rad.setCurrentChannel(10);

        int expected = 0;
        int actual = rad.getCurrentChannel();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void setToMaxChannel() {
        Radio rad = new Radio();

        rad.setToMaxChannel();

        int expected = 9;
        int actual = rad.getCurrentChannel();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldNotSetChannelAboveMax() {
        Radio rad = new Radio();

        rad.setCurrentChannel(-1);

        int expected = 0;
        int actual = rad.getCurrentChannel();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void checkNextChannel() {
        Radio rad = new Radio();

        rad.setCurrentChannel(5);
        rad.nextChannel();

        int expected = 6;
        int actual = rad.getCurrentChannel();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void checkNextChannelFromNineToZero() {
        Radio rad = new Radio();

        rad.setCurrentChannel(9);
        rad.nextChannel();

        int expected = 0;
        int actual = rad.getCurrentChannel();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void checkPrevChannel() {
        Radio rad = new Radio();

        rad.setCurrentChannel(6);
        rad.prevChannel();

        int expected = 5;
        int actual = rad.getCurrentChannel();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void checkPrevChannelFromeZeroToNine() {
        Radio rad = new Radio();

        rad.setCurrentChannel(-1);
        rad.prevChannel();

        int expected = 9;
        int actual = rad.getCurrentChannel();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetCurrentVolume() {
        Radio rad = new Radio();

        rad.setCurrentVolume(-1);

        int expected = 0;
        int actual = rad.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetToMaxVolume() {
        Radio rad = new Radio();

        rad.setToMaxVolume();

        int expectad = 100;
        int actual = rad.getCurrentVolume();

        Assertions.assertEquals(expectad, actual);
    }

    @Test
    public void shouldNotSetVolumeAboveMax() {
        Radio rad = new Radio();

        rad.setCurrentVolume(120);

        int expectad = 0;
        int actual = rad.getCurrentVolume();

        Assertions.assertEquals(expectad, actual);
    }

    @Test
    public void checkVolumeIncrease() {
        Radio rad = new Radio();

        rad.setCurrentVolume(54);
        rad.increaseVolume();

        int expected = 55;
        int actual = rad.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void checkVolumeIncreaseNotAboveMax() {
        Radio rad = new Radio();

        rad.setCurrentVolume(100);
        rad.increaseVolume();

        int expected = 100;
        int actual = rad.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void checkVolumeDecrease() {
        Radio rad = new Radio();

        rad.setCurrentVolume(1);
        rad.decreaseVolume();

        int expected = 0;
        int actual = rad.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void checkVolumeDecreaseBelowMin() {
        Radio rad = new Radio();

        rad.setCurrentVolume(-1);
        rad.decreaseVolume();

        int expected = 0;
        int actual = rad.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }
}
