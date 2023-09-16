package flow_proyecto;

import java.util.Map;
import javazoom.jlgui.basicplayer.BasicController;
import javazoom.jlgui.basicplayer.BasicPlayer;
import javazoom.jlgui.basicplayer.BasicPlayerEvent;
import javazoom.jlgui.basicplayer.BasicPlayerListener;

public class MusicPlayer implements BasicPlayerListener {

    BasicPlayer player = new BasicPlayer();
    BasicController control = (BasicController) player;
    MusicPlayer_UI vp;

    public MusicPlayer(MusicPlayer_UI v) {
        player.addBasicPlayerListener(this);
        vp = v;
    }

    public void opened(Object o, Map properties) {
    }

    public void progress(int i, long l, byte[] bytes, Map properties) {
    }

    public void stateUpdated(BasicPlayerEvent event) {
        if (player.getStatus() == BasicPlayer.STOPPED && vp.detenido == false) {
            vp.eventoSiguiente();
        }
    }

    public void setController(BasicController controller) { 
    }
}
