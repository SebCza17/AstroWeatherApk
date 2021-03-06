package noname.astroweather.weather.data;

import org.json.JSONObject;

import noname.astroweather.weather.data.interfaces.JSONPopulator;

public class Channel implements JSONPopulator {
    private Item item;
    private Wind wind;
    private Location location;
    private Atmosphere atmosphere;

    public Item getItem() {
        return item;
    }

    public Wind getWind() {
        return wind;
    }

    public Location getLocation() {
        return location;
    }

    public Atmosphere getAtmosphere() {
        return atmosphere;
    }

    @Override
    public void populate(JSONObject data) {

        item = new Item();
        item.populate(data.optJSONObject("item"));

        wind = new Wind();
        wind.populate(data.optJSONObject("wind"));

        location = new Location();
        location.populate(data.optJSONObject("location"));

        atmosphere = new Atmosphere();
        atmosphere.populate(data.optJSONObject("atmosphere"));
    }
}
