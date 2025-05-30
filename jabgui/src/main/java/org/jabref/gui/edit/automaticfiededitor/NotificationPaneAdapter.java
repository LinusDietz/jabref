package org.jabref.gui.edit.automaticfiededitor;

import java.util.List;

import javafx.scene.Node;
import javafx.util.Duration;

import org.jabref.gui.LibraryTab;
import org.jabref.gui.icon.IconTheme;

public class NotificationPaneAdapter extends LibraryTab.DatabaseNotification {

    public NotificationPaneAdapter(Node content) {
        super(content);
    }

    public void notify(int affectedEntries, int totalEntries) {
        String notificationMessage = "%d/%d affected entries".formatted(affectedEntries, totalEntries);
        Node notificationGraphic = IconTheme.JabRefIcons.INTEGRITY_INFO.getGraphicNode();

        notify(notificationGraphic, notificationMessage, List.of(), Duration.seconds(2));
    }
}
