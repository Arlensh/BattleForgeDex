// cards/scheduler/CardSyncScheduler.java
package com.battleforgedex.cards.scheduler;

import com.battleforgedex.cards.services.CardService;
import lombok.RequiredArgsConstructor;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class CardSyncScheduler {

    private final CardService cardService;

    @Scheduled(cron = "0 0 2 * * *") // 2 AM every day
    public void syncDaily() {
        cardService.syncCards();
    }
}
