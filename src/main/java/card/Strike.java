package card;

import basemod.abstracts.CustomCard;
import com.megacrit.cardcrawl.actions.AbstractGameAction;
import com.megacrit.cardcrawl.actions.common.DamageAction;
import com.megacrit.cardcrawl.cards.DamageInfo;
import com.megacrit.cardcrawl.characters.AbstractPlayer;
import com.megacrit.cardcrawl.core.CardCrawlGame;
import com.megacrit.cardcrawl.localization.CardStrings;
import com.megacrit.cardcrawl.monsters.AbstractMonster;

public class Strike extends CustomCard {

    public static final String ID = "keqing_mod_strike";
    private static final CardStrings CARD_STRINGS = CardCrawlGame.languagePack.getCardStrings("keqing_mod_strike");
    public static final String NAME = CARD_STRINGS.NAME;
    public static final String IMG_URL = "img/card/strike.png";
    public static final int COST = 1;
    public static final String DESCRIPTION = CARD_STRINGS.DESCRIPTION;
    public static final int BASE_DEMAGE = 5;

    public Strike() {
        super(ID, NAME, IMG_URL, COST, DESCRIPTION, CardType.ATTACK, CardColor.PURPLE, CardRarity.BASIC, CardTarget.ENEMY);
        this.baseDamage = BASE_DEMAGE;
        this.tags.add(CardTags.STRIKE);
        this.tags.add(CardTags.STARTER_STRIKE);
    }


    @Override
    public void upgrade() {

    }

    @Override
    public void use(AbstractPlayer abstractPlayer, AbstractMonster abstractMonster) {
        this.addToBot(new DamageAction(abstractMonster, new DamageInfo(abstractPlayer, this.damage, this.damageTypeForTurn), AbstractGameAction.AttackEffect.SLASH_DIAGONAL));

    }
}
