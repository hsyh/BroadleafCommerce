/*
 * Copyright 2008-2009 the original author or authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.broadleafcommerce.rating.service;

import java.util.List;
import java.util.Map;

import org.broadleafcommerce.profile.domain.Customer;
import org.broadleafcommerce.rating.domain.RatingSummary;
import org.broadleafcommerce.rating.domain.ReviewDetail;
import org.broadleafcommerce.rating.service.type.RatingSortType;
import org.broadleafcommerce.rating.service.type.RatingType;

public interface RatingService {

    public RatingSummary saveRatingSummary(RatingSummary rating);
    public void deleteRatingSummary(RatingSummary rating);
    public RatingSummary readRatingSummary(String itemId, RatingType type);
    public Map<String, RatingSummary> readRatingSummaries(List<String> itemIds, RatingType type);
    public void rateItem(String itemId, RatingType type, Customer customer, Double rating);

    public List<ReviewDetail> readReviews(String itemId, RatingType type, int start, int finish, RatingSortType sortBy);
    public void reviewItem(String itemId, RatingType type, Customer customer, String reviewText);
    public void markReviewHelpful(Long reviewId, Customer customer, Boolean helpful);

}