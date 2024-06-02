package fr.xephi.authme.listener.protocollib;

import com.github.retrooper.packetevents.event.PacketListenerAbstract;
import com.github.retrooper.packetevents.event.PacketListenerPriority;
import com.github.retrooper.packetevents.event.PacketReceiveEvent;
import com.github.retrooper.packetevents.protocol.packettype.PacketType;
import com.github.retrooper.packetevents.wrapper.configuration.client.WrapperConfigClientSettings;
import com.github.retrooper.packetevents.wrapper.play.client.WrapperPlayClientSettings;
import fr.xephi.authme.util.message.I18NUtils;

import java.util.UUID;

public class I18NGetLocalePacketEventsAdapter extends PacketListenerAbstract {

    public I18NGetLocalePacketEventsAdapter() {
        super(PacketListenerPriority.NORMAL);
    }

    @Override
    public void onPacketReceive(PacketReceiveEvent event) {
        if (event.getPacketType() == PacketType.Play.Client.CLIENT_SETTINGS) {
            UUID uuid = event.getUser().getUUID();
            String locale = new WrapperPlayClientSettings(event).getLocale();

            I18NUtils.addLocale(uuid, locale);
        } else if (event.getPacketType() == PacketType.Configuration.Client.CLIENT_SETTINGS) {
            UUID uuid = event.getUser().getUUID();
            String locale = new WrapperConfigClientSettings(event).getLocale();

            I18NUtils.addLocale(uuid, locale);
        }
    }
}
