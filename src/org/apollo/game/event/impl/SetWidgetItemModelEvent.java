package org.apollo.game.event.impl;

import org.apollo.game.event.Event;

/**
 * An {@link Event} sent to the client to set a widget's displayed item model.
 * 
 * @author Chris Fletcher
 */
public final class SetWidgetItemModelEvent extends Event {

	/**
	 * The interface's id.
	 */
	private final int interfaceId;

	/**
	 * The model's (item) id.
	 */
	private final int modelId;

	/**
	 * The zoom level.
	 */
	private final int zoom;

	/**
	 * Creates a new set interface item model event.
	 * 
	 * @param interfaceId The interface's id.
	 * @param modelId The model's (item) id.
	 * @param zoom The zoom level.
	 */
	public SetWidgetItemModelEvent(int interfaceId, int modelId, int zoom) {
		this.interfaceId = interfaceId;
		this.modelId = modelId;
		this.zoom = zoom;
	}

	/**
	 * Gets the interface's id.
	 * 
	 * @return The id.
	 */
	public int getInterfaceId() {
		return interfaceId;
	}

	/**
	 * Gets the model's (item) id.
	 * 
	 * @return The id.
	 */
	public int getModelId() {
		return modelId;
	}

	/**
	 * Gets the zoom level.
	 * 
	 * @return The zoom.
	 */
	public int getZoom() {
		return zoom;
	}

}