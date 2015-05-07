package com.example.jalvarado.slidertest;

import android.os.Parcel;
import android.os.Parcelable;

import java.util.ArrayList;
import java.util.List;


public class DetailedListing implements Parcelable{

    private int id;
    private int picCount;
    private int mlsUniqueId;
    private int listPrice;
    private String propertyType;
    private String city;
    private int bedrooms;
    private int bath;
    private String status;
    private String entryDate;
    private String mlsNumber;
    private int streetNumber;
    private String streetDirectional;
    private String streetName;
    private int cityId;
    private int zipcode;
    private String address;
    private int primaryListingPid;
    private int secondaryListingPid;
    private int municipalCode;
    private int townshipNumber;
    private int sectionNumber;
    private int subdivisionNumber;
    private int area;
    private int parcelNumber;
    private int yearBuilt;
    private String virtualTourLink;
    private double halfBath;
    private int livingArea;
    private int garageSpaces;
    private String waterfront;
    private int totalArea;
    private String pool;
    private int maintenanceFee;
    private String petsAllowed;
    private int unitNumber;
    private int lotArea;
    private String listingBrokerCode;
    private String listingBrokerOffice;
    private double latitude;
    private double longitude;
    private int originalListPrice;
    private String mainPhotoUrl;
    private int salePrice;
    private int daysOnMarket;
    private String closeDate;
    private String sellingBrokerCode;
    private String expirationDate;
    private int condoId;
    private String complex;
    private String subdivision;
    private String communityName;
    private String lotDimensions;
    private double hoaFees;
    private int taxes;
    private int taxYear;
    private String rentalType;
    private String rentalOccupancy;
    private String rentalFurnished;
    private String commercialType;
    private String commercialLeaseSale;
    private String commercialStyle;
    private String commercialBuilding;
    private String commercialBuildingAlt;
    private String countyId;
    private int sellingPublicId;
    private int secondSellingPublicId;
    private String agentName;
    private String brokerOfficePhone;
    private String agentPhone;
    private String secondAgentPhone;
    private String secondAgentName;
    private String parkingRestrictions;
    private List<String> condoWaterfrontView = new ArrayList<String>();
    private String foreclosure;
    private String shortStatus;
    private String homeDesign;
    private String homeView;
    private String shortSale;
    private String reo;
    private String internetAddressOk;
    private String modifiedDate;
    private String imageModifiedDate;
    private String directions;
    private String propertyStyle;
    private List<String> buildingAmenities = new ArrayList<String>();
    private List<String> equipment = new ArrayList<String>();
    private List<String> exteriorFeatures = new ArrayList<String>();
    private List<String> interiorFeatures = new ArrayList<String>();
    private List<String> constructionType = new ArrayList<String>();
    private String floors;
    private String roofType;
    private String homeHeating;
    private String petRestriction;
    private List<String> homeCooling = new ArrayList<String>();
    private String homeDesign2;
    private String bedroom2Size;
    private String bedroom3Size;
    private String bedroom4Size;
    private String bedroomMasterSize;
    private String kitchenSize;
    private String livingRoomSize;
    private String rentalIncludes;
    private String description;
    private String rooms;
    private String sewer;
    private String water;
    private String subdv;
    private String dinner;
    private String floorLocation;
    private String propertyTypeDb;
    private String petsIcon;
    private String furnishedIcon;
    private double priceSqft;
    private double priceSqMeters;
    private double livingAreaMeters;
    private int priceChangeDays;
    private int priceChangeType;
    private int priceChangeDiff;
    private String daysOnMarketStr;
    private int daysOnMarketUnix;
    private List<ListingImage> listingImages = new ArrayList<ListingImage>();

    public DetailedListing() {

    }

    /**
     *
     * @return
     * The id
     */
    public int getId() {
        return id;
    }

    /**
     *
     * @param id
     * The id
     */
    public void setId(int id) {
        this.id = id;
    }

    /**
     *
     * @return
     * The picCount
     */
    public int getPicCount() {
        return picCount;
    }

    /**
     *
     * @param picCount
     * The pic_count
     */
    public void setPicCount(int picCount) {
        this.picCount = picCount;
    }

    /**
     *
     * @return
     * The mlsUniqueId
     */
    public int getMlsUniqueId() {
        return mlsUniqueId;
    }

    /**
     *
     * @param mlsUniqueId
     * The mls_unique_id
     */
    public void setMlsUniqueId(int mlsUniqueId) {
        this.mlsUniqueId = mlsUniqueId;
    }

    /**
     *
     * @return
     * The listPrice
     */
    public int getListPrice() {
        return listPrice;
    }

    /**
     *
     * @param listPrice
     * The list_price
     */
    public void setListPrice(int listPrice) {
        this.listPrice = listPrice;
    }

    /**
     *
     * @return
     * The propertyType
     */
    public String getPropertyType() {
        return propertyType;
    }

    public String getPropertyTypeString() {
        String propType;
        switch (getPropertyType()){
            case "RE1":
                propType = "Single/Family";
                break;
            case "RE2":
                propType = "Condo/Townhouse";
                break;
            case "RNT":
                propType = "Rental";
                break;
            case "RIN":
                propType = "Single/Family";
                break;
            case "RLD":
                propType = "Residential Land";
                break;
            case "COM":
                propType = "Commercial";
                break;
            case "CLD":
                propType = "Commercial Land";
                break;
            default:
                propType = "N/A";
        }
        return propType;
    }

    /**
     *
     * @param propertyType
     * The property_type
     */
    public void setPropertyType(String propertyType) {
        this.propertyType = propertyType;
    }

    /**
     *
     * @return
     * The city
     */
    public String getCity() {
        return city;
    }

    /**
     *
     * @param city
     * The city
     */
    public void setCity(String city) {
        this.city = city;
    }

    /**
     *
     * @return
     * The bedrooms
     */
    public int getBedrooms() {
        return bedrooms;
    }

    /**
     *
     * @param bedrooms
     * The bedrooms
     */
    public void setBedrooms(int bedrooms) {
        this.bedrooms = bedrooms;
    }

    /**
     *
     * @return
     * The bath
     */
    public int getBath() {
        return bath;
    }

    /**
     *
     * @param bath
     * The bath
     */
    public void setBath(int bath) {
        this.bath = bath;
    }

    /**
     *
     * @return
     * The status
     */
    public String getStatus() {
        return status;
    }

    public String getStatusString() {
        String statusString;
        switch (getStatus()) {
            case "A":
                statusString = "Active";
                break;
            case "B":
                statusString = "Backup";
                break;
            case "PS":
                statusString = "Pending Sale";
                break;
            case "CS":
                statusString = "Closed Sale";
                break;
            case "C":
                statusString = "Canceled";
                break;
            case "R":
                statusString = "Rented";
                break;
            case "X":
                statusString = "Expired";
                break;
            default:
                statusString = "N/A";
                break;
        }

        return statusString;
    }

    /**
     *
     * @param status
     * The status
     */
    public void setStatus(String status) {
        this.status = status;
    }

    /**
     *
     * @return
     * The entryDate
     */
    public String getEntryDate() {
        return entryDate;
    }

    /**
     *
     * @param entryDate
     * The entry_date
     */
    public void setEntryDate(String entryDate) {
        this.entryDate = entryDate;
    }

    /**
     *
     * @return
     * The mlsNumber
     */
    public String getMlsNumber() {
        return mlsNumber;
    }

    /**
     *
     * @param mlsNumber
     * The mls_number
     */
    public void setMlsNumber(String mlsNumber) {
        this.mlsNumber = mlsNumber;
    }

    /**
     *
     * @return
     * The streetNumber
     */
    public int getStreetNumber() {
        return streetNumber;
    }

    /**
     *
     * @param streetNumber
     * The street_number
     */
    public void setStreetNumber(int streetNumber) {
        this.streetNumber = streetNumber;
    }

    /**
     *
     * @return
     * The streetDirectional
     */
    public Object getStreetDirectional() {
        return streetDirectional;
    }

    /**
     *
     * @param streetDirectional
     * The street_directional
     */
    public void setStreetDirectional(String streetDirectional) {
        this.streetDirectional = streetDirectional;
    }

    /**
     *
     * @return
     * The streetName
     */
    public String getStreetName() {
        return streetName;
    }

    /**
     *
     * @param streetName
     * The street_name
     */
    public void setStreetName(String streetName) {
        this.streetName = streetName;
    }

    /**
     *
     * @return
     * The cityId
     */
    public int getCityId() {
        return cityId;
    }

    /**
     *
     * @param cityId
     * The city_id
     */
    public void setCityId(int cityId) {
        this.cityId = cityId;
    }

    /**
     *
     * @return
     * The zipcode
     */
    public int getZipcode() {
        return zipcode;
    }

    /**
     *
     * @param zipcode
     * The zipcode
     */
    public void setZipcode(int zipcode) {
        this.zipcode = zipcode;
    }

    /**
     *
     * @return
     * The address
     */
    public String getAddress() {
        return address;
    }

    /**
     *
     * @param address
     * The address
     */
    public void setAddress(String address) {
        this.address = address;
    }

    /**
     *
     * @return
     * The primaryListingPid
     */
    public int getPrimaryListingPid() {
        return primaryListingPid;
    }

    /**
     *
     * @param primaryListingPid
     * The primary_listing_pid
     */
    public void setPrimaryListingPid(int primaryListingPid) {
        this.primaryListingPid = primaryListingPid;
    }

    /**
     *
     * @return
     * The secondaryListingPid
     */
    public Object getSecondaryListingPid() {
        return secondaryListingPid;
    }

    /**
     *
     * @param secondaryListingPid
     * The secondary_listing_pid
     */
    public void setSecondaryListingPid(int secondaryListingPid) {
        this.secondaryListingPid = secondaryListingPid;
    }

    /**
     *
     * @return
     * The municipalCode
     */
    public int getMunicipalCode() {
        return municipalCode;
    }

    /**
     *
     * @param municipalCode
     * The municipal_code
     */
    public void setMunicipalCode(int municipalCode) {
        this.municipalCode = municipalCode;
    }

    /**
     *
     * @return
     * The townshipNumber
     */
    public int getTownshipNumber() {
        return townshipNumber;
    }

    /**
     *
     * @param townshipNumber
     * The township_number
     */
    public void setTownshipNumber(int townshipNumber) {
        this.townshipNumber = townshipNumber;
    }

    /**
     *
     * @return
     * The sectionNumber
     */
    public int getSectionNumber() {
        return sectionNumber;
    }

    /**
     *
     * @param sectionNumber
     * The section_number
     */
    public void setSectionNumber(int sectionNumber) {
        this.sectionNumber = sectionNumber;
    }

    /**
     *
     * @return
     * The subdivisionNumber
     */
    public int getSubdivisionNumber() {
        return subdivisionNumber;
    }

    /**
     *
     * @param subdivisionNumber
     * The subdivision_number
     */
    public void setSubdivisionNumber(int subdivisionNumber) {
        this.subdivisionNumber = subdivisionNumber;
    }

    /**
     *
     * @return
     * The area
     */
    public int getArea() {
        return area;
    }

    /**
     *
     * @param area
     * The area
     */
    public void setArea(int area) {
        this.area = area;
    }

    /**
     *
     * @return
     * The parcelNumber
     */
    public int getParcelNumber() {
        return parcelNumber;
    }

    /**
     *
     * @param parcelNumber
     * The parcel_number
     */
    public void setParcelNumber(int parcelNumber) {
        this.parcelNumber = parcelNumber;
    }

    /**
     *
     * @return
     * The yearBuilt
     */
    public int getYearBuilt() {
        return yearBuilt;
    }

    /**
     *
     * @param yearBuilt
     * The year_built
     */
    public void setYearBuilt(int yearBuilt) {
        this.yearBuilt = yearBuilt;
    }

    /**
     *
     * @return
     * The virtualTourLink
     */
    public Object getVirtualTourLink() {
        return virtualTourLink;
    }

    /**
     *
     * @param virtualTourLink
     * The virtual_tour_link
     */
    public void setVirtualTourLink(String virtualTourLink) {
        this.virtualTourLink = virtualTourLink;
    }

    /**
     *
     * @return
     * The halfBath
     */
    public double getHalfBath() {
        return halfBath;
    }

    /**
     *
     * @param halfBath
     * The half_bath
     */
    public void setHalfBath(double halfBath) {
        this.halfBath = halfBath;
    }

    /**
     *
     * @return
     * The livingArea
     */
    public int getLivingArea() {
        return livingArea;
    }

    public String getFormattedLivingArea() {
        return ValueFormatters.formatBetter(getLivingArea()) + " ft²";
    }

    /**
     *
     * @param livingArea
     * The living_area
     */
    public void setLivingArea(int livingArea) {
        this.livingArea = livingArea;
    }

    /**
     *
     * @return
     * The garageSpaces
     */
    public int getGarageSpaces() {
        return garageSpaces;
    }

    /**
     *
     * @param garageSpaces
     * The garage_spaces
     */
    public void setGarageSpaces(int garageSpaces) {
        this.garageSpaces = garageSpaces;
    }

    /**
     *
     * @return
     * The waterfront
     */
    public String getWaterfront() {
        return waterfront;
    }

    public String getWaterfrontString() {
        return ValueFormatters.formatYesNo(getWaterfront());
    }

    /**
     *
     * @param waterfront
     * The waterfront
     */
    public void setWaterfront(String waterfront) {
        this.waterfront = waterfront;
    }

    /**
     *
     * @return
     * The totalArea
     */
    public int getTotalArea() {
        return totalArea;
    }

    /**
     *
     * @param totalArea
     * The total_area
     */
    public void setTotalArea(int totalArea) {
        this.totalArea = totalArea;
    }

    /**
     *
     * @return
     * The pool
     */
    public String getPool() {
        return pool;
    }

    public String getPoolString() {
        return ValueFormatters.formatYesNo(getPool());
    }

    /**
     *
     * @param pool
     * The pool
     */
    public void setPool(String pool) {
        this.pool = pool;
    }

    /**
     *
     * @return
     * The maintenanceFee
     */
    public int getMaintenanceFee() {
        return maintenanceFee;
    }

    /**
     *
     * @param maintenanceFee
     * The maintenance_fee
     */
    public void setMaintenanceFee(int maintenanceFee) {
        this.maintenanceFee = maintenanceFee;
    }

    /**
     *
     * @return
     * The petsAllowed
     */
    public String getPetsAllowed() {
        return petsAllowed;
    }

    /**
     *
     * @param petsAllowed
     * The pets_allowed
     */
    public void setPetsAllowed(String petsAllowed) {
        this.petsAllowed = petsAllowed;
    }

    /**
     *
     * @return
     * The unitNumber
     */
    public int getUnitNumber() {
        return unitNumber;
    }

    /**
     *
     * @param unitNumber
     * The unit_number
     */
    public void setUnitNumber(int unitNumber) {
        this.unitNumber = unitNumber;
    }

    /**
     *
     * @return
     * The lotArea
     */
    public int getLotArea() {
        return lotArea;
    }

    /**
     *
     * @param lotArea
     * The lot_area
     */
    public void setLotArea(int lotArea) {
        this.lotArea = lotArea;
    }

    /**
     *
     * @return
     * The listingBrokerCode
     */
    public String getListingBrokerCode() {
        return listingBrokerCode;
    }

    /**
     *
     * @param listingBrokerCode
     * The listing_broker_code
     */
    public void setListingBrokerCode(String listingBrokerCode) {
        this.listingBrokerCode = listingBrokerCode;
    }

    /**
     *
     * @return
     * The listingBrokerOffice
     */
    public String getListingBrokerOffice() {
        return listingBrokerOffice;
    }

    /**
     *
     * @param listingBrokerOffice
     * The listing_broker_office
     */
    public void setListingBrokerOffice(String listingBrokerOffice) {
        this.listingBrokerOffice = listingBrokerOffice;
    }

    /**
     *
     * @return
     * The latitude
     */
    public double getLatitude() {
        return latitude;
    }

    /**
     *
     * @param latitude
     * The latitude
     */
    public void setLatitude(double latitude) {
        this.latitude = latitude;
    }

    /**
     *
     * @return
     * The longitude
     */
    public double getLongitude() {
        return longitude;
    }

    /**
     *
     * @param longitude
     * The longitude
     */
    public void setLongitude(double longitude) {
        this.longitude = longitude;
    }

    /**
     *
     * @return
     * The originalListPrice
     */
    public int getOriginalListPrice() {
        return originalListPrice;
    }

    /**
     *
     * @param originalListPrice
     * The original_list_price
     */
    public void setOriginalListPrice(int originalListPrice) {
        this.originalListPrice = originalListPrice;
    }

    /**
     *
     * @return
     * The mainPhotoUrl
     */
    public String getMainPhotoUrl() {
        return mainPhotoUrl;
    }

    /**
     *
     * @param mainPhotoUrl
     * The main_photo_url
     */
    public void setMainPhotoUrl(String mainPhotoUrl) {
        this.mainPhotoUrl = mainPhotoUrl;
    }

    /**
     *
     * @return
     * The salePrice
     */
    public int getSalePrice() {
        return salePrice;
    }

    /**
     *
     * @param salePrice
     * The sale_price
     */
    public void setSalePrice(int salePrice) {
        this.salePrice = salePrice;
    }

    /**
     *
     * @return
     * The daysOnMarket
     */
    public int getDaysOnMarket() {
        return daysOnMarket;
    }

    /**
     *
     * @param daysOnMarket
     * The days_on_market
     */
    public void setDaysOnMarket(int daysOnMarket) {
        this.daysOnMarket = daysOnMarket;
    }

    /**
     *
     * @return
     * The closeDate
     */
    public Object getCloseDate() {
        return closeDate;
    }

    /**
     *
     * @param closeDate
     * The close_date
     */
    public void setCloseDate(String closeDate) {
        this.closeDate = closeDate;
    }

    /**
     *
     * @return
     * The sellingBrokerCode
     */
    public Object getSellingBrokerCode() {
        return sellingBrokerCode;
    }

    /**
     *
     * @param sellingBrokerCode
     * The selling_broker_code
     */
    public void setSellingBrokerCode(String sellingBrokerCode) {
        this.sellingBrokerCode = sellingBrokerCode;
    }

    /**
     *
     * @return
     * The expirationDate
     */
    public Object getExpirationDate() {
        return expirationDate;
    }

    /**
     *
     * @param expirationDate
     * The expiration_date
     */
    public void setExpirationDate(String expirationDate) {
        this.expirationDate = expirationDate;
    }

    /**
     *
     * @return
     * The condoId
     */
    public int getCondoId() {
        return condoId;
    }

    /**
     *
     * @param condoId
     * The condo_id
     */
    public void setCondoId(int condoId) {
        this.condoId = condoId;
    }

    /**
     *
     * @return
     * The complex
     */
    public String getComplex() {
        return complex;
    }

    /**
     *
     * @param complex
     * The complex
     */
    public void setComplex(String complex) {
        this.complex = complex;
    }

    /**
     *
     * @return
     * The subdivision
     */
    public String getSubdivision() {
        return subdivision;
    }

    /**
     *
     * @param subdivision
     * The subdivision
     */
    public void setSubdivision(String subdivision) {
        this.subdivision = subdivision;
    }

    /**
     *
     * @return
     * The communityName
     */
    public String getCommunityName() {
        return communityName;
    }

    /**
     *
     * @param communityName
     * The community_name
     */
    public void setCommunityName(String communityName) {
        this.communityName = communityName;
    }

    /**
     *
     * @return
     * The lotDimensions
     */
    public String getLotDimensions() {
        return lotDimensions;
    }

    /**
     *
     * @param lotDimensions
     * The lot_dimensions
     */
    public void setLotDimensions(String lotDimensions) {
        this.lotDimensions = lotDimensions;
    }

    /**
     *
     * @return
     * The hoaFees
     */
    public double getHoaFees() {
        return hoaFees;
    }

    /**
     *
     * @param hoaFees
     * The hoa_fees
     */
    public void setHoaFees(double hoaFees) {
        this.hoaFees = hoaFees;
    }

    /**
     *
     * @return
     * The taxes
     */
    public int getTaxes() {
        return taxes;
    }

    /**
     *
     * @param taxes
     * The taxes
     */
    public void setTaxes(int taxes) {
        this.taxes = taxes;
    }

    /**
     *
     * @return
     * The taxYear
     */
    public int getTaxYear() {
        return taxYear;
    }

    /**
     *
     * @param taxYear
     * The tax_year
     */
    public void setTaxYear(int taxYear) {
        this.taxYear = taxYear;
    }

    /**
     *
     * @return
     * The rentalType
     */
    public String getRentalType() {
        return rentalType;
    }

    /**
     *
     * @param rentalType
     * The rental_type
     */
    public void setRentalType(String rentalType) {
        this.rentalType = rentalType;
    }

    /**
     *
     * @return
     * The rentalOccupancy
     */
    public String getRentalOccupancy() {
        return rentalOccupancy;
    }

    /**
     *
     * @param rentalOccupancy
     * The rental_occupancy
     */
    public void setRentalOccupancy(String rentalOccupancy) {
        this.rentalOccupancy = rentalOccupancy;
    }

    /**
     *
     * @return
     * The rentalFurnished
     */
    public String getRentalFurnished() {
        return rentalFurnished;
    }

    /**
     *
     * @param rentalFurnished
     * The rental_furnished
     */
    public void setRentalFurnished(String rentalFurnished) {
        this.rentalFurnished = rentalFurnished;
    }

    /**
     *
     * @return
     * The commercialType
     */
    public String getCommercialType() {
        return commercialType;
    }

    /**
     *
     * @param commercialType
     * The commercial_type
     */
    public void setCommercialType(String commercialType) {
        this.commercialType = commercialType;
    }

    /**
     *
     * @return
     * The commercialLeaseSale
     */
    public String getCommercialLeaseSale() {
        return commercialLeaseSale;
    }

    /**
     *
     * @param commercialLeaseSale
     * The commercial_lease_sale
     */
    public void setCommercialLeaseSale(String commercialLeaseSale) {
        this.commercialLeaseSale = commercialLeaseSale;
    }

    /**
     *
     * @return
     * The commercialStyle
     */
    public String getCommercialStyle() {
        return commercialStyle;
    }

    /**
     *
     * @param commercialStyle
     * The commercial_style
     */
    public void setCommercialStyle(String commercialStyle) {
        this.commercialStyle = commercialStyle;
    }

    /**
     *
     * @return
     * The commercialBuilding
     */
    public String getCommercialBuilding() {
        return commercialBuilding;
    }

    /**
     *
     * @param commercialBuilding
     * The commercial_building
     */
    public void setCommercialBuilding(String commercialBuilding) {
        this.commercialBuilding = commercialBuilding;
    }

    /**
     *
     * @return
     * The commercialBuildingAlt
     */
    public String getCommercialBuildingAlt() {
        return commercialBuildingAlt;
    }

    /**
     *
     * @param commercialBuildingAlt
     * The commercial_building_alt
     */
    public void setCommercialBuildingAlt(String commercialBuildingAlt) {
        this.commercialBuildingAlt = commercialBuildingAlt;
    }

    /**
     *
     * @return
     * The countyId
     */
    public String getCountyId() {
        return countyId;
    }

    /**
     *
     * @param countyId
     * The county_id
     */
    public void setCountyId(String countyId) {
        this.countyId = countyId;
    }

    /**
     *
     * @return
     * The sellingPublicId
     */
    public int getSellingPublicId() {
        return sellingPublicId;
    }

    /**
     *
     * @param sellingPublicId
     * The selling_public_id
     */
    public void setSellingPublicId(int sellingPublicId) {
        this.sellingPublicId = sellingPublicId;
    }

    /**
     *
     * @return
     * The secondSellingPublicId
     */
    public int getSecondSellingPublicId() {
        return secondSellingPublicId;
    }

    /**
     *
     * @param secondSellingPublicId
     * The second_selling_public_id
     */
    public void setSecondSellingPublicId(int secondSellingPublicId) {
        this.secondSellingPublicId = secondSellingPublicId;
    }

    /**
     *
     * @return
     * The agentName
     */
    public String getAgentName() {
        return agentName;
    }

    /**
     *
     * @param agentName
     * The agent_name
     */
    public void setAgentName(String agentName) {
        this.agentName = agentName;
    }

    /**
     *
     * @return
     * The brokerOfficePhone
     */
    public String getBrokerOfficePhone() {
        return brokerOfficePhone;
    }

    /**
     *
     * @param brokerOfficePhone
     * The broker_office_phone
     */
    public void setBrokerOfficePhone(String brokerOfficePhone) {
        this.brokerOfficePhone = brokerOfficePhone;
    }

    /**
     *
     * @return
     * The agentPhone
     */
    public String getAgentPhone() {
        return agentPhone;
    }

    /**
     *
     * @param agentPhone
     * The agent_phone
     */
    public void setAgentPhone(String agentPhone) {
        this.agentPhone = agentPhone;
    }

    /**
     *
     * @return
     * The secondAgentPhone
     */
    public String getSecondAgentPhone() {
        return secondAgentPhone;
    }

    /**
     *
     * @param secondAgentPhone
     * The second_agent_phone
     */
    public void setSecondAgentPhone(String secondAgentPhone) {
        this.secondAgentPhone = secondAgentPhone;
    }

    /**
     *
     * @return
     * The secondAgentName
     */
    public String getSecondAgentName() {
        return secondAgentName;
    }

    /**
     *
     * @param secondAgentName
     * The second_agent_name
     */
    public void setSecondAgentName(String secondAgentName) {
        this.secondAgentName = secondAgentName;
    }

    /**
     *
     * @return
     * The parkingRestrictions
     */
    public String getParkingRestrictions() {
        return parkingRestrictions;
    }

    /**
     *
     * @param parkingRestrictions
     * The parking_restrictions
     */
    public void setParkingRestrictions(String parkingRestrictions) {
        this.parkingRestrictions = parkingRestrictions;
    }

    /**
     *
     * @return
     * The condoWaterfrontView
     */
    public List<String> getCondoWaterfrontView() {
        return condoWaterfrontView;
    }

    /**
     *
     * @param condoWaterfrontView
     * The condo_waterfront_view
     */
    public void setCondoWaterfrontView(List<String> condoWaterfrontView) {
        this.condoWaterfrontView = condoWaterfrontView;
    }

    /**
     *
     * @return
     * The foreclosure
     */
    public String getForeclosure() {
        return foreclosure;
    }

    /**
     *
     * @param foreclosure
     * The foreclosure
     */
    public void setForeclosure(String foreclosure) {
        this.foreclosure = foreclosure;
    }

    /**
     *
     * @return
     * The shortStatus
     */
    public String getShortStatus() {
        return shortStatus;
    }

    /**
     *
     * @param shortStatus
     * The short_status
     */
    public void setShortStatus(String shortStatus) {
        this.shortStatus = shortStatus;
    }

    /**
     *
     * @return
     * The homeDesign
     */
    public String getHomeDesign() {
        return homeDesign;
    }

    /**
     *
     * @param homeDesign
     * The home_design
     */
    public void setHomeDesign(String homeDesign) {
        this.homeDesign = homeDesign;
    }

    /**
     *
     * @return
     * The homeView
     */
    public String getHomeView() {
        return homeView;
    }

    /**
     *
     * @param homeView
     * The home_view
     */
    public void setHomeView(String homeView) {
        this.homeView = homeView;
    }

    /**
     *
     * @return
     * The shortSale
     */
    public String getShortSale() {
        return shortSale;
    }

    /**
     *
     * @param shortSale
     * The short_sale
     */
    public void setShortSale(String shortSale) {
        this.shortSale = shortSale;
    }

    /**
     *
     * @return
     * The reo
     */
    public String getReo() {
        return reo;
    }

    /**
     *
     * @param reo
     * The reo
     */
    public void setReo(String reo) {
        this.reo = reo;
    }

    /**
     *
     * @return
     * The internetAddressOk
     */
    public String getInternetAddressOk() {
        return internetAddressOk;
    }

    /**
     *
     * @param internetAddressOk
     * The internet_address_ok
     */
    public void setInternetAddressOk(String internetAddressOk) {
        this.internetAddressOk = internetAddressOk;
    }

    /**
     *
     * @return
     * The modifiedDate
     */
    public String getModifiedDate() {
        return modifiedDate;
    }

    /**
     *
     * @param modifiedDate
     * The modified_date
     */
    public void setModifiedDate(String modifiedDate) {
        this.modifiedDate = modifiedDate;
    }

    /**
     *
     * @return
     * The imageModifiedDate
     */
    public String getImageModifiedDate() {
        return imageModifiedDate;
    }

    /**
     *
     * @param imageModifiedDate
     * The image_modified_date
     */
    public void setImageModifiedDate(String imageModifiedDate) {
        this.imageModifiedDate = imageModifiedDate;
    }

    /**
     *
     * @return
     * The directions
     */
    public String getDirections() {
        return directions;
    }

    /**
     *
     * @param directions
     * The directions
     */
    public void setDirections(String directions) {
        this.directions = directions;
    }

    /**
     *
     * @return
     * The propertyStyle
     */
    public String getPropertyStyle() {
        return propertyStyle;
    }

    /**
     *
     * @param propertyStyle
     * The property_style
     */
    public void setPropertyStyle(String propertyStyle) {
        this.propertyStyle = propertyStyle;
    }

    /**
     *
     * @return
     * The buildingAmenities
     */
    public List<String> getBuildingAmenities() {
        return buildingAmenities;
    }

    /**
     *
     * @param buildingAmenities
     * The building_amenities
     */
    public void setBuildingAmenities(List<String> buildingAmenities) {
        this.buildingAmenities = buildingAmenities;
    }

    /**
     *
     * @return
     * The equipment
     */
    public List<String> getEquipment() {
        return equipment;
    }

    /**
     *
     * @param equipment
     * The equipment
     */
    public void setEquipment(List<String> equipment) {
        this.equipment = equipment;
    }

    /**
     *
     * @return
     * The exteriorFeatures
     */
    public List<String> getExteriorFeatures() {
        return exteriorFeatures;
    }

    /**
     *
     * @param exteriorFeatures
     * The exterior_features
     */
    public void setExteriorFeatures(List<String> exteriorFeatures) {
        this.exteriorFeatures = exteriorFeatures;
    }

    /**
     *
     * @return
     * The interiorFeatures
     */
    public List<String> getInteriorFeatures() {
        return interiorFeatures;
    }

    /**
     *
     * @param interiorFeatures
     * The interior_features
     */
    public void setInteriorFeatures(List<String> interiorFeatures) {
        this.interiorFeatures = interiorFeatures;
    }

    /**
     *
     * @return
     * The constructionType
     */
    public List<String> getConstructionType() {
        return constructionType;
    }

    /**
     *
     * @param constructionType
     * The construction_type
     */
    public void setConstructionType(List<String> constructionType) {
        this.constructionType = constructionType;
    }

    /**
     *
     * @return
     * The floors
     */
    public String getFloors() {
        return floors;
    }

    /**
     *
     * @param floors
     * The floors
     */
    public void setFloors(String floors) {
        this.floors = floors;
    }

    /**
     *
     * @return
     * The roofType
     */
    public String getRoofType() {
        return roofType;
    }

    /**
     *
     * @param roofType
     * The roof_type
     */
    public void setRoofType(String roofType) {
        this.roofType = roofType;
    }

    /**
     *
     * @return
     * The homeHeating
     */
    public String getHomeHeating() {
        return homeHeating;
    }

    /**
     *
     * @param homeHeating
     * The home_heating
     */
    public void setHomeHeating(String homeHeating) {
        this.homeHeating = homeHeating;
    }

    /**
     *
     * @return
     * The petRestriction
     */
    public String getPetRestriction() {
        return petRestriction;
    }

    /**
     *
     * @param petRestriction
     * The pet_restriction
     */
    public void setPetRestriction(String petRestriction) {
        this.petRestriction = petRestriction;
    }

    /**
     *
     * @return
     * The homeCooling
     */
    public List<String> getHomeCooling() {
        return homeCooling;
    }

    /**
     *
     * @param homeCooling
     * The home_cooling
     */
    public void setHomeCooling(List<String> homeCooling) {
        this.homeCooling = homeCooling;
    }

    /**
     *
     * @return
     * The homeDesign2
     */
    public String getHomeDesign2() {
        return homeDesign2;
    }

    /**
     *
     * @param homeDesign2
     * The home_design_2
     */
    public void setHomeDesign2(String homeDesign2) {
        this.homeDesign2 = homeDesign2;
    }

    /**
     *
     * @return
     * The bedroom2Size
     */
    public String getBedroom2Size() {
        return bedroom2Size;
    }

    /**
     *
     * @param bedroom2Size
     * The bedroom_2_size
     */
    public void setBedroom2Size(String bedroom2Size) {
        this.bedroom2Size = bedroom2Size;
    }

    /**
     *
     * @return
     * The bedroom3Size
     */
    public String getBedroom3Size() {
        return bedroom3Size;
    }

    /**
     *
     * @param bedroom3Size
     * The bedroom_3_size
     */
    public void setBedroom3Size(String bedroom3Size) {
        this.bedroom3Size = bedroom3Size;
    }

    /**
     *
     * @return
     * The bedroom4Size
     */
    public String getBedroom4Size() {
        return bedroom4Size;
    }

    /**
     *
     * @param bedroom4Size
     * The bedroom_4_size
     */
    public void setBedroom4Size(String bedroom4Size) {
        this.bedroom4Size = bedroom4Size;
    }

    /**
     *
     * @return
     * The bedroomMasterSize
     */
    public String getBedroomMasterSize() {
        return bedroomMasterSize;
    }

    /**
     *
     * @param bedroomMasterSize
     * The bedroom_master_size
     */
    public void setBedroomMasterSize(String bedroomMasterSize) {
        this.bedroomMasterSize = bedroomMasterSize;
    }

    /**
     *
     * @return
     * The kitchenSize
     */
    public String getKitchenSize() {
        return kitchenSize;
    }

    /**
     *
     * @param kitchenSize
     * The kitchen_size
     */
    public void setKitchenSize(String kitchenSize) {
        this.kitchenSize = kitchenSize;
    }

    /**
     *
     * @return
     * The livingRoomSize
     */
    public String getLivingRoomSize() {
        return livingRoomSize;
    }

    /**
     *
     * @param livingRoomSize
     * The living_room_size
     */
    public void setLivingRoomSize(String livingRoomSize) {
        this.livingRoomSize = livingRoomSize;
    }

    /**
     *
     * @return
     * The rentalIncludes
     */
    public String getRentalIncludes() {
        return rentalIncludes;
    }

    /**
     *
     * @param rentalIncludes
     * The rental_includes
     */
    public void setRentalIncludes(String rentalIncludes) {
        this.rentalIncludes = rentalIncludes;
    }

    /**
     *
     * @return
     * The description
     */
    public String getDescription() {
        return description;
    }

    /**
     *
     * @param description
     * The description
     */
    public void setDescription(String description) {
        this.description = description;
    }

    /**
     *
     * @return
     * The rooms
     */
    public String getRooms() {
        return rooms;
    }

    /**
     *
     * @param rooms
     * The rooms
     */
    public void setRooms(String rooms) {
        this.rooms = rooms;
    }

    /**
     *
     * @return
     * The sewer
     */
    public String getSewer() {
        return sewer;
    }

    /**
     *
     * @param sewer
     * The sewer
     */
    public void setSewer(String sewer) {
        this.sewer = sewer;
    }

    /**
     *
     * @return
     * The water
     */
    public String getWater() {
        return water;
    }

    /**
     *
     * @param water
     * The water
     */
    public void setWater(String water) {
        this.water = water;
    }

    /**
     *
     * @return
     * The subdv
     */
    public String getSubdv() {
        return subdv;
    }

    /**
     *
     * @param subdv
     * The subdv
     */
    public void setSubdv(String subdv) {
        this.subdv = subdv;
    }

    /**
     *
     * @return
     * The dinner
     */
    public String getDinner() {
        return dinner;
    }

    /**
     *
     * @param dinner
     * The dinner
     */
    public void setDinner(String dinner) {
        this.dinner = dinner;
    }

    /**
     *
     * @return
     * The floorLocation
     */
    public String getFloorLocation() {
        return floorLocation;
    }

    /**
     *
     * @param floorLocation
     * The floor_location
     */
    public void setFloorLocation(String floorLocation) {
        this.floorLocation = floorLocation;
    }

    /**
     *
     * @return
     * The propertyTypeDb
     */
    public String getPropertyTypeDb() {
        return propertyTypeDb;
    }

    /**
     *
     * @param propertyTypeDb
     * The property_type_db
     */
    public void setPropertyTypeDb(String propertyTypeDb) {
        this.propertyTypeDb = propertyTypeDb;
    }

    /**
     *
     * @return
     * The petsIcon
     */
    public String getPetsIcon() {
        return petsIcon;
    }

    /**
     *
     * @param petsIcon
     * The pets_icon
     */
    public void setPetsIcon(String petsIcon) {
        this.petsIcon = petsIcon;
    }

    /**
     *
     * @return
     * The furnishedIcon
     */
    public String getFurnishedIcon() {
        return furnishedIcon;
    }

    /**
     *
     * @param furnishedIcon
     * The furnished_icon
     */
    public void setFurnishedIcon(String furnishedIcon) {
        this.furnishedIcon = furnishedIcon;
    }

    /**
     *
     * @return
     * The priceSqft
     */
    public double getPriceSqft() {
        return priceSqft;
    }

    /**
     *
     * @param priceSqft
     * The price_sqft
     */
    public void setPriceSqft(double priceSqft) {
        this.priceSqft = priceSqft;
    }

    /**
     *
     * @return
     * The priceSqMeters
     */
    public double getPriceSqMeters() {
        return priceSqMeters;
    }

    /**
     *
     * @param priceSqMeters
     * The price_sq_meters
     */
    public void setPriceSqMeters(double priceSqMeters) {
        this.priceSqMeters = priceSqMeters;
    }

    /**
     *
     * @return
     * The livingAreaMeters
     */
    public double getLivingAreaMeters() {
        return livingAreaMeters;
    }

    public String getFormattedLivingAreaMeters() {
        return ValueFormatters.formatBetter((int) getLivingAreaMeters()) + " m²";
    }

    /**
     *
     * @param livingAreaMeters
     * The living_area_meters
     */
    public void setLivingAreaMeters(double livingAreaMeters) {
        this.livingAreaMeters = livingAreaMeters;
    }

    /**
     *
     * @return
     * The priceChangeDays
     */
    public int getPriceChangeDays() {
        return priceChangeDays;
    }

    /**
     *
     * @param priceChangeDays
     * The price_change_days
     */
    public void setPriceChangeDays(int priceChangeDays) {
        this.priceChangeDays = priceChangeDays;
    }

    /**
     *
     * @return
     * The priceChangeType
     */
    public int getPriceChangeType() {
        return priceChangeType;
    }

    /**
     *
     * @param priceChangeType
     * The price_change_type
     */
    public void setPriceChangeType(int priceChangeType) {
        this.priceChangeType = priceChangeType;
    }

    /**
     *
     * @return
     * The priceChangeDiff
     */
    public int getPriceChangeDiff() {
        return priceChangeDiff;
    }

    /**
     *
     * @param priceChangeDiff
     * The price_change_diff
     */
    public void setPriceChangeDiff(int priceChangeDiff) {
        this.priceChangeDiff = priceChangeDiff;
    }

    /**
     *
     * @return
     * The daysOnMarketStr
     */
    public String getDaysOnMarketStr() {
        return daysOnMarketStr;
    }

    /**
     *
     * @param daysOnMarketStr
     * The days_on_market_str
     */
    public void setDaysOnMarketStr(String daysOnMarketStr) {
        this.daysOnMarketStr = daysOnMarketStr;
    }

    /**
     *
     * @return
     * The daysOnMarketUnix
     */
    public int getDaysOnMarketUnix() {
        return daysOnMarketUnix;
    }

    /**
     *
     * @param daysOnMarketUnix
     * The days_on_market_unix
     */
    public void setDaysOnMarketUnix(int daysOnMarketUnix) {
        this.daysOnMarketUnix = daysOnMarketUnix;
    }

    /**
     *
     * @return
     * The listingImages
     */
    public List<ListingImage> getListingImages() {
        return listingImages;
    }

    /**
     *
     * @param listingImages
     * The listing_images
     */
    public void setListingImages(List<ListingImage> listingImages) {
        this.listingImages = listingImages;
    }



    public static class ListingImage implements Parcelable {
        private String fileName;
        private String comments;
        private int photoId;

        public String getFileName() {
            return fileName;
        }

        public void setFileName(String fileName) {
            this.fileName = fileName;
        }

        public String getComments() {
            return comments;
        }

        public void setComments(String comments) {
            this.comments = comments;
        }

        public int getPhotoId() {
            return photoId;
        }

        public void setPhotoId(int photoId) {
            this.photoId = photoId;
        }


        public ListingImage() {

        }

        protected ListingImage(Parcel in) {
            fileName = in.readString();
            comments = in.readString();
            photoId = in.readInt();
        }

        @Override
        public int describeContents() {
            return 0;
        }

        @Override
        public void writeToParcel(Parcel dest, int flags) {
            dest.writeString(fileName);
            dest.writeString(comments);
            dest.writeInt(photoId);
        }

        @SuppressWarnings("unused")
        public static final Creator<ListingImage> CREATOR = new Creator<ListingImage>() {
            @Override
            public ListingImage createFromParcel(Parcel in) {
                return new ListingImage(in);
            }

            @Override
            public ListingImage[] newArray(int size) {
                return new ListingImage[size];
            }
        };
    }

    protected DetailedListing(Parcel in) {
        id = in.readInt();
        picCount = in.readInt();
        mlsUniqueId = in.readInt();
        listPrice = in.readInt();
        propertyType = in.readString();
        city = in.readString();
        bedrooms = in.readInt();
        bath = in.readInt();
        status = in.readString();
        entryDate = in.readString();
        mlsNumber = in.readString();
        streetNumber = in.readInt();
        streetDirectional = in.readString();
        streetName = in.readString();
        cityId = in.readInt();
        zipcode = in.readInt();
        address = in.readString();
        primaryListingPid = in.readInt();
        secondaryListingPid = in.readInt();
        municipalCode = in.readInt();
        townshipNumber = in.readInt();
        sectionNumber = in.readInt();
        subdivisionNumber = in.readInt();
        area = in.readInt();
        parcelNumber = in.readInt();
        yearBuilt = in.readInt();
        virtualTourLink = in.readString();
        halfBath = in.readDouble();
        livingArea = in.readInt();
        garageSpaces = in.readInt();
        waterfront = in.readString();
        totalArea = in.readInt();
        pool = in.readString();
        maintenanceFee = in.readInt();
        petsAllowed = in.readString();
        unitNumber = in.readInt();
        lotArea = in.readInt();
        listingBrokerCode = in.readString();
        listingBrokerOffice = in.readString();
        latitude = in.readDouble();
        longitude = in.readDouble();
        originalListPrice = in.readInt();
        mainPhotoUrl = in.readString();
        salePrice = in.readInt();
        daysOnMarket = in.readInt();
        closeDate = in.readString();
        sellingBrokerCode = in.readString();
        expirationDate = in.readString();
        condoId = in.readInt();
        complex = in.readString();
        subdivision = in.readString();
        communityName = in.readString();
        lotDimensions = in.readString();
        hoaFees = in.readDouble();
        taxes = in.readInt();
        taxYear = in.readInt();
        rentalType = in.readString();
        rentalOccupancy = in.readString();
        rentalFurnished = in.readString();
        commercialType = in.readString();
        commercialLeaseSale = in.readString();
        commercialStyle = in.readString();
        commercialBuilding = in.readString();
        commercialBuildingAlt = in.readString();
        countyId = in.readString();
        sellingPublicId = in.readInt();
        secondSellingPublicId = in.readInt();
        agentName = in.readString();
        brokerOfficePhone = in.readString();
        agentPhone = in.readString();
        secondAgentPhone = in.readString();
        secondAgentName = in.readString();
        parkingRestrictions = in.readString();
        if (in.readByte() == 0x01) {
            condoWaterfrontView = new ArrayList<String>();
            in.readList(condoWaterfrontView, String.class.getClassLoader());
        } else {
            condoWaterfrontView = null;
        }
        foreclosure = in.readString();
        shortStatus = in.readString();
        homeDesign = in.readString();
        homeView = in.readString();
        shortSale = in.readString();
        reo = in.readString();
        internetAddressOk = in.readString();
        modifiedDate = in.readString();
        imageModifiedDate = in.readString();
        directions = in.readString();
        propertyStyle = in.readString();
        if (in.readByte() == 0x01) {
            buildingAmenities = new ArrayList<String>();
            in.readList(buildingAmenities, String.class.getClassLoader());
        } else {
            buildingAmenities = null;
        }
        if (in.readByte() == 0x01) {
            equipment = new ArrayList<String>();
            in.readList(equipment, String.class.getClassLoader());
        } else {
            equipment = null;
        }
        if (in.readByte() == 0x01) {
            exteriorFeatures = new ArrayList<String>();
            in.readList(exteriorFeatures, String.class.getClassLoader());
        } else {
            exteriorFeatures = null;
        }
        if (in.readByte() == 0x01) {
            interiorFeatures = new ArrayList<String>();
            in.readList(interiorFeatures, String.class.getClassLoader());
        } else {
            interiorFeatures = null;
        }
        if (in.readByte() == 0x01) {
            constructionType = new ArrayList<String>();
            in.readList(constructionType, String.class.getClassLoader());
        } else {
            constructionType = null;
        }
        floors = in.readString();
        roofType = in.readString();
        homeHeating = in.readString();
        petRestriction = in.readString();
        if (in.readByte() == 0x01) {
            homeCooling = new ArrayList<String>();
            in.readList(homeCooling, String.class.getClassLoader());
        } else {
            homeCooling = null;
        }
        homeDesign2 = in.readString();
        bedroom2Size = in.readString();
        bedroom3Size = in.readString();
        bedroom4Size = in.readString();
        bedroomMasterSize = in.readString();
        kitchenSize = in.readString();
        livingRoomSize = in.readString();
        rentalIncludes = in.readString();
        description = in.readString();
        rooms = in.readString();
        sewer = in.readString();
        water = in.readString();
        subdv = in.readString();
        dinner = in.readString();
        floorLocation = in.readString();
        propertyTypeDb = in.readString();
        petsIcon = in.readString();
        furnishedIcon = in.readString();
        priceSqft = in.readDouble();
        priceSqMeters = in.readDouble();
        livingAreaMeters = in.readDouble();
        priceChangeDays = in.readInt();
        priceChangeType = in.readInt();
        priceChangeDiff = in.readInt();
        daysOnMarketStr = in.readString();
        daysOnMarketUnix = in.readInt();
        if (in.readByte() == 0x01) {
            listingImages = new ArrayList<ListingImage>();
            in.readList(listingImages, ListingImage.class.getClassLoader());
        } else {
            listingImages = null;
        }
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeInt(id);
        dest.writeInt(picCount);
        dest.writeInt(mlsUniqueId);
        dest.writeInt(listPrice);
        dest.writeString(propertyType);
        dest.writeString(city);
        dest.writeInt(bedrooms);
        dest.writeInt(bath);
        dest.writeString(status);
        dest.writeString(entryDate);
        dest.writeString(mlsNumber);
        dest.writeInt(streetNumber);
        dest.writeString(streetDirectional);
        dest.writeString(streetName);
        dest.writeInt(cityId);
        dest.writeInt(zipcode);
        dest.writeString(address);
        dest.writeInt(primaryListingPid);
        dest.writeInt(secondaryListingPid);
        dest.writeInt(municipalCode);
        dest.writeInt(townshipNumber);
        dest.writeInt(sectionNumber);
        dest.writeInt(subdivisionNumber);
        dest.writeInt(area);
        dest.writeInt(parcelNumber);
        dest.writeInt(yearBuilt);
        dest.writeString(virtualTourLink);
        dest.writeDouble(halfBath);
        dest.writeInt(livingArea);
        dest.writeInt(garageSpaces);
        dest.writeString(waterfront);
        dest.writeInt(totalArea);
        dest.writeString(pool);
        dest.writeInt(maintenanceFee);
        dest.writeString(petsAllowed);
        dest.writeInt(unitNumber);
        dest.writeInt(lotArea);
        dest.writeString(listingBrokerCode);
        dest.writeString(listingBrokerOffice);
        dest.writeDouble(latitude);
        dest.writeDouble(longitude);
        dest.writeInt(originalListPrice);
        dest.writeString(mainPhotoUrl);
        dest.writeInt(salePrice);
        dest.writeInt(daysOnMarket);
        dest.writeString(closeDate);
        dest.writeString(sellingBrokerCode);
        dest.writeString(expirationDate);
        dest.writeInt(condoId);
        dest.writeString(complex);
        dest.writeString(subdivision);
        dest.writeString(communityName);
        dest.writeString(lotDimensions);
        dest.writeDouble(hoaFees);
        dest.writeInt(taxes);
        dest.writeInt(taxYear);
        dest.writeString(rentalType);
        dest.writeString(rentalOccupancy);
        dest.writeString(rentalFurnished);
        dest.writeString(commercialType);
        dest.writeString(commercialLeaseSale);
        dest.writeString(commercialStyle);
        dest.writeString(commercialBuilding);
        dest.writeString(commercialBuildingAlt);
        dest.writeString(countyId);
        dest.writeInt(sellingPublicId);
        dest.writeInt(secondSellingPublicId);
        dest.writeString(agentName);
        dest.writeString(brokerOfficePhone);
        dest.writeString(agentPhone);
        dest.writeString(secondAgentPhone);
        dest.writeString(secondAgentName);
        dest.writeString(parkingRestrictions);
        if (condoWaterfrontView == null) {
            dest.writeByte((byte) (0x00));
        } else {
            dest.writeByte((byte) (0x01));
            dest.writeList(condoWaterfrontView);
        }
        dest.writeString(foreclosure);
        dest.writeString(shortStatus);
        dest.writeString(homeDesign);
        dest.writeString(homeView);
        dest.writeString(shortSale);
        dest.writeString(reo);
        dest.writeString(internetAddressOk);
        dest.writeString(modifiedDate);
        dest.writeString(imageModifiedDate);
        dest.writeString(directions);
        dest.writeString(propertyStyle);
        if (buildingAmenities == null) {
            dest.writeByte((byte) (0x00));
        } else {
            dest.writeByte((byte) (0x01));
            dest.writeList(buildingAmenities);
        }
        if (equipment == null) {
            dest.writeByte((byte) (0x00));
        } else {
            dest.writeByte((byte) (0x01));
            dest.writeList(equipment);
        }
        if (exteriorFeatures == null) {
            dest.writeByte((byte) (0x00));
        } else {
            dest.writeByte((byte) (0x01));
            dest.writeList(exteriorFeatures);
        }
        if (interiorFeatures == null) {
            dest.writeByte((byte) (0x00));
        } else {
            dest.writeByte((byte) (0x01));
            dest.writeList(interiorFeatures);
        }
        if (constructionType == null) {
            dest.writeByte((byte) (0x00));
        } else {
            dest.writeByte((byte) (0x01));
            dest.writeList(constructionType);
        }
        dest.writeString(floors);
        dest.writeString(roofType);
        dest.writeString(homeHeating);
        dest.writeString(petRestriction);
        if (homeCooling == null) {
            dest.writeByte((byte) (0x00));
        } else {
            dest.writeByte((byte) (0x01));
            dest.writeList(homeCooling);
        }
        dest.writeString(homeDesign2);
        dest.writeString(bedroom2Size);
        dest.writeString(bedroom3Size);
        dest.writeString(bedroom4Size);
        dest.writeString(bedroomMasterSize);
        dest.writeString(kitchenSize);
        dest.writeString(livingRoomSize);
        dest.writeString(rentalIncludes);
        dest.writeString(description);
        dest.writeString(rooms);
        dest.writeString(sewer);
        dest.writeString(water);
        dest.writeString(subdv);
        dest.writeString(dinner);
        dest.writeString(floorLocation);
        dest.writeString(propertyTypeDb);
        dest.writeString(petsIcon);
        dest.writeString(furnishedIcon);
        dest.writeDouble(priceSqft);
        dest.writeDouble(priceSqMeters);
        dest.writeDouble(livingAreaMeters);
        dest.writeInt(priceChangeDays);
        dest.writeInt(priceChangeType);
        dest.writeInt(priceChangeDiff);
        dest.writeString(daysOnMarketStr);
        dest.writeInt(daysOnMarketUnix);
        if (listingImages == null) {
            dest.writeByte((byte) (0x00));
        } else {
            dest.writeByte((byte) (0x01));
            dest.writeList(listingImages);
        }
    }

    @SuppressWarnings("unused")
    public static final Creator<DetailedListing> CREATOR = new Creator<DetailedListing>() {
        @Override
        public DetailedListing createFromParcel(Parcel in) {
            return new DetailedListing(in);
        }

        @Override
        public DetailedListing[] newArray(int size) {
            return new DetailedListing[size];
        }
    };
}
