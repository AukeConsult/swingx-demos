/*
 * $Id: ImagePanelDemo.java 1164 2009-11-03 04:22:00Z kschaefe $
 *
 * Copyright 2009 Sun Microsystems, Inc., 4150 Network Circle,
 * Santa Clara, California 95054, U.S.A. All rights reserved.
 *
 * This library is free software; you can redistribute it and/or
 * modify it under the terms of the GNU Lesser General Public
 * License as published by the Free Software Foundation; either
 * version 2.1 of the License, or (at your option) any later version.
 * 
 * This library is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the GNU
 * Lesser General Public License for more details.
 * 
 * You should have received a copy of the GNU Lesser General Public
 * License along with this library; if not, write to the Free Software
 * Foundation, Inc., 51 Franklin St, Fifth Floor, Boston, MA  02110-1301  USA
 */
package org.jdesktop.swingx.demos.imagepanel;

import java.awt.GridLayout;

import javax.swing.BorderFactory;

import org.jdesktop.application.ResourceConverter;
import org.jdesktop.swingx.JXImagePanel;
import org.jdesktop.swingx.appframework.StyleConverter;
import org.jdesktop.swingxset.DefaultDemoPanel;

import com.sun.swingset3.DemoProperties;

/**
 * A demo for the {@code JXButton}.
 *
 * @author Karl George Schaefer
 * @author Richard Bair (original JXImagePanelDemoPanel)
 */
@DemoProperties(
    value = "JXImagePanel Demo",
    category = "Controls",
    description = "Demonstrates JXImagePanel, a image display control.",
    sourceFiles = {
        "org/jdesktop/swingx/demos/imagepanel/ImagePanelDemo.java",
        "org/jdesktop/swingx/demos/imagepanel/resources/ImagePanelDemo.properties",
        "org/jdesktop/swingx/demos/imagepanel/resources/ImagePanelDemo.html",
        "org/jdesktop/swingx/demos/imagepanel/resources/images/ImagePanelDemo.png",
        "org/jdesktop/swingx/demos/imagepanel/resources/images/duke_wave.gif",
        "org/jdesktop/swingx/appframework/StyleConverter.java"
    }
)
@SuppressWarnings("serial")
public class ImagePanelDemo extends DefaultDemoPanel {
    private JXImagePanel centeredPanel;
    private JXImagePanel scaledAspectPanel;
    private JXImagePanel scaledPanel;
    private JXImagePanel tiledPanel;
    
    static {
        ResourceConverter.register(new StyleConverter());
    }
    
    /**
     * main method allows us to run as a standalone demo.
     */
    public static void main(String[] args) {
        runDemo(ImagePanelDemo.class);
    }

    /**
     * {@inheritDoc}
     */
    protected void createDemo() {
        setLayout(new GridLayout(2, 2));
        
        centeredPanel = new JXImagePanel();
        centeredPanel.setName("centered");
        centeredPanel.setBorder(BorderFactory.createTitledBorder("Centered"));
        add(centeredPanel);
        
        tiledPanel = new JXImagePanel();
        tiledPanel.setName("tiled");
        tiledPanel.setBorder(BorderFactory.createTitledBorder("Tiled"));
        add(tiledPanel);
        
        scaledPanel = new JXImagePanel();
        scaledPanel.setName("scaled");
        scaledPanel.setBorder(BorderFactory.createTitledBorder("Scaled"));
        add(scaledPanel);

        scaledAspectPanel = new JXImagePanel();
        scaledAspectPanel.setName("scaledAspect");
        scaledAspectPanel.setBorder(BorderFactory.createTitledBorder("Scaled (Keep Aspect Ratio)"));
        add(scaledAspectPanel);
    }
}
