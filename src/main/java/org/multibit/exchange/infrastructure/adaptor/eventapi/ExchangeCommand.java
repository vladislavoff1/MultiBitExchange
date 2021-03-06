package org.multibit.exchange.infrastructure.adaptor.eventapi;

import org.axonframework.commandhandling.annotation.TargetAggregateIdentifier;

import static com.google.common.base.Preconditions.checkNotNull;

/**
 * <p>AbstractCommand targeting an {@link org.multibit.exchange.domain.model.Exchange} aggregate root.</p>
 *
 * @since 0.0.1
 */
public abstract class ExchangeCommand {

  @TargetAggregateIdentifier
  protected final ExchangeId exchangeId;

  public ExchangeCommand(ExchangeId exchangeId) {
    checkNotNull(exchangeId, "exchangeId must not be null");

    this.exchangeId = exchangeId;
  }

  public ExchangeId getExchangeId() {
    return exchangeId;
  }
}
