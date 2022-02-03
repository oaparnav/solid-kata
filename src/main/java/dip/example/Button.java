package dip.example;

public class Button
{
    private Device _device;
    private boolean _state;

    public Button(Device device)
    {
        _device = device;
    }

    public void toggle()
    {
        _state = !_state;
        boolean buttonOn = _state;
        if (buttonOn) {
            _device.turnOn();
        } else {
            _device.turnOff();
        }
    }

}
