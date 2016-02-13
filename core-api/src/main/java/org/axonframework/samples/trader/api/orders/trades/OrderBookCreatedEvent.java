/*
 * Copyright (c) 2010-2012. Axon Framework
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.axonframework.samples.trader.api.orders.trades;

/**
 * <p>A new OrderBook is created for the company with the provided identifier.</p>
 *
 * @author Jettro Coenradie
 */
public class OrderBookCreatedEvent {

    private OrderBookId orderBookId;

    public OrderBookCreatedEvent(OrderBookId orderBookId) {
        this.orderBookId = orderBookId;
    }

    public OrderBookId getOrderBookIdentifier() {
        return this.orderBookId;
    }
}
