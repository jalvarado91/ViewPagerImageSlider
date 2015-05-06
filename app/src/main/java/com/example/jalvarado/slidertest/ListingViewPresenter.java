package com.example.jalvarado.slidertest;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.util.ArrayList;


public class ListingViewPresenter {


    public DetailedListing getDetailedListing(String listingJSON) throws JSONException {
        DetailedListing listing = new DetailedListing();

        JSONObject listingResults = new JSONObject(listingJSON);
        JSONArray JSONListing = listingResults.getJSONArray("rows");

        JSONObject jListing = JSONListing.getJSONObject(0);

        listing.setId(jListing.getInt("id"));
        listing.setPicCount(jListing.getInt("pic_count"));
        listing.setPropertyType(jListing.getString("property_type"));
        listing.setCity(jListing.getString("city"));
        listing.setBedrooms(jListing.getInt("bedrooms"));
        listing.setBath(jListing.getInt("bath"));
        listing.setStatus(jListing.getString("status"));
        listing.setEntryDate(jListing.getString("entry_date"));
        listing.setMlsNumber(jListing.getString("mls_number"));
        listing.setStreetNumber(jListing.getInt("street_number"));
        listing.setStreetName(jListing.getString("street_name"));
        listing.setCityId(jListing.getInt("city_id"));
        listing.setZipcode(jListing.getInt("zipcode"));
        listing.setAddress(jListing.getString("address"));
        listing.setPrimaryListingPid(jListing.optInt("primary_listing_pid"));
        listing.setSectionNumber(jListing.optInt("section_number"));
        listing.setSubdivisionNumber(jListing.optInt("subdivision_number"));
        listing.setArea(jListing.optInt("area"));
        listing.setYearBuilt(jListing.optInt("year_built"));
//        listing.setHalfBath(jListing.optDouble("half_bath"));
        listing.setLivingArea(jListing.optInt("living_area"));
        listing.setGarageSpaces(jListing.optInt("garage_spaces"));
        listing.setWaterfront(jListing.optString("waterfront"));
        listing.setTotalArea(jListing.getInt("total_area"));
        listing.setPool(jListing.optString("pool"));
        listing.setMaintenanceFee(jListing.optInt("maintenance_fee"));
        listing.setPetsAllowed(jListing.optString("pets_allowed"));
        listing.setUnitNumber(jListing.optInt("unit_number"));
        listing.setListingBrokerOffice(jListing.getString("listing_broker_office"));
        listing.setLatitude(jListing.optDouble("latitude"));
        listing.setLongitude(jListing.optDouble("longitude"));
        listing.setOriginalListPrice(jListing.getInt("original_list_price"));
        listing.setMainPhotoUrl(jListing.getString("main_photo_url"));
        listing.setSalePrice(jListing.getInt("sale_price"));
        listing.setDaysOnMarket(jListing.getInt("days_on_market"));
        listing.setCondoId(jListing.optInt("condo_id"));
        listing.setComplex(jListing.optString("complex"));
        listing.setHoaFees(jListing.optDouble("hoa_fees"));
        listing.setTaxes(jListing.optInt("taxes"));
        listing.setTaxYear(jListing.optInt("tax_year"));
        listing.setAgentName(jListing.optString("agent_name"));
        listing.setBrokerOfficePhone(jListing.optString("broker_office_phone"));
        listing.setShortSale(jListing.optString("short_sale"));
        listing.setReo(jListing.optString("reo"));
        listing.setModifiedDate(jListing.optString("modified_data"));
        listing.setPropertyStyle(jListing.optString("property_style"));
        listing.setPetRestriction(jListing.optString("bedroom_master_size"));
        listing.setDescription(jListing.getString("description"));
        listing.setPriceSqft(jListing.getDouble("price_sqft"));
        listing.setPriceSqMeters(jListing.getDouble("price_sq_meters"));
        listing.setLivingAreaMeters(jListing.getDouble("living_area_meters"));
        listing.setPriceChangeDays(jListing.getInt("price_change_days"));
        listing.setPriceChangeType(jListing.getInt("price_change_type"));
        listing.setPriceChangeDiff(jListing.getInt("price_change_diff"));
        listing.setDaysOnMarketStr(jListing.getString("days_on_market_str"));
        listing.setDaysOnMarketUnix(jListing.getInt("days_on_market_unix"));

        listing.setEquipment(parseJSONArray(jListing.getJSONArray("equipment")));
        listing.setExteriorFeatures(parseJSONArray(jListing.getJSONArray("exterior_features")));
        listing.setInteriorFeatures(parseJSONArray(jListing.getJSONArray("interior_features")));
        listing.setConstructionType(parseJSONArray(jListing.getJSONArray("construction_type")));

        listing.setListingImages(parseJSONImages(jListing.getJSONArray("listing_images")));

        return listing;

    }

    private ArrayList<String> parseJSONArray(JSONArray jsonArray) throws JSONException {
        ArrayList<String> mList = new ArrayList<String>();

        for (int i = 0; i < jsonArray.length(); i++) {
            mList.add(jsonArray.getString(i));
        }

        return mList;
    }

    private ArrayList<DetailedListing.ListingImage> parseJSONImages(JSONArray jsonArray) throws JSONException {
        ArrayList<DetailedListing.ListingImage> listingImages =
                new ArrayList<DetailedListing.ListingImage>();


        for (int i = 0; i < jsonArray.length(); i++) {
            JSONObject currImgJSONObj = jsonArray.getJSONObject(i);

            DetailedListing.ListingImage image = new DetailedListing.ListingImage();
            image.setFileName(currImgJSONObj.getString("file_name"));
            image.setComments(currImgJSONObj.getString("comments"));
            image.setPhotoId(currImgJSONObj.getInt("photo_id"));

            listingImages.add(image);
        }

        return listingImages;
    }
}
