import greenfoot.*;

public class MuteButton extends Actor {
    private static GreenfootImage mutedImage;
    private static GreenfootImage unmutedImage;

    private boolean muted;

    public MuteButton() {
        mute();
    }

    @Override
    public void act() {
        if (Greenfoot.mouseClicked(this)) toggleMute();
    }

    public boolean isMuted() {
        return muted;
    }

    private void toggleMute() {
        if (muted) unmute(); else mute();
    }

    private void mute() {
        if (mutedImage == null) mutedImage = new GreenfootImage("images/volumeknop_uit.png");

        muted = true;
        setImage(mutedImage);
    }

    private void unmute() {
        if (unmutedImage == null) unmutedImage = new GreenfootImage("images/volumeknop_aan.png");

        muted = false;
        setImage(unmutedImage);
    }
}

