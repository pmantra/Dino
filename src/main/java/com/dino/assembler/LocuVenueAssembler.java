//package com.dino.assembler;
//
//import static org.springframework.hateoas.mvc.ControllerLinkBuilder.linkTo;
//import static org.springframework.hateoas.mvc.ControllerLinkBuilder.methodOn;
//
//import java.util.logging.Logger;
//
//import org.springframework.hateoas.mvc.ResourceAssemblerSupport;
//import org.springframework.stereotype.Component;
//
//import com.dino.controller.RestaurantController;
//import com.dino.entity.LocuVenue;
//import com.dino.rest.entity.LocuVenueResource;
//import com.dino.yelp.DinoUtilities;
//
//@Component
//public class LocuVenueAssembler extends
//ResourceAssemblerSupport<LocuVenue, LocuVenueResource> {
//
//	private static Logger LOG = Logger.getLogger(LocuVenueAssembler.class
//			.getName());
//
//	public LocuVenueAssembler() {
//		super(RestaurantController.class, LocuVenueResource.class);
//	}
//
//	@Override
//	public LocuVenueResource toResource(LocuVenue locuVenue) {
//		LocuVenueResource retVal = instantiateResource(locuVenue);
//		retVal.setLocuVenue(locuVenue);
//		String encodedName = DinoUtilities.encodeUrlParameter(locuVenue
//				.getName());
//		String encodedLocality = DinoUtilities.encodeUrlParameter(locuVenue
//				.getLocality());
//		retVal.add(linkTo(
//				methodOn(RestaurantController.class).searchRestaurant(
//						encodedName, encodedLocality)).withSelfRel());
//		return retVal;
//
//	}
//	
//	
//}