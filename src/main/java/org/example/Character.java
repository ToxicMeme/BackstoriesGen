package org.example;

import java.util.Random;

public class Character  {
    private Race race;
    private CharacterClass characterClass;
    private SocialStatus socialStatus;
    private Personality personality;
    private Genre genre;
    private BackstoryType backstoryType;


    public Character() {
        initializeCharacter();
    }

    public String initializeCharacter() {
        Random rand = new Random();
        this.race = Race.values()[rand.nextInt(Race.values().length)];
        this.characterClass = CharacterClass.values()[rand.nextInt(CharacterClass.values().length)];
        this.socialStatus = SocialStatus.values()[rand.nextInt(SocialStatus.values().length)];
        this.personality = Personality.values()[rand.nextInt(Personality.values().length)];
        this.genre = Genre.values()[rand.nextInt(Genre.values().length)];
        this.backstoryType = BackstoryType.values()[rand.nextInt(BackstoryType.values().length)];
        return String.format("""
                        Персонаж:
                        - Раса: %s
                        - Класс: %s
                        - Социальный статус: %s
                        - Характер персонажа: %s
                        - Жанр предыстории: %s
                        - Тип предыстории: %s
                        """,
                race, characterClass, socialStatus, personality, genre, backstoryType);
    }

    public String generatedStory() {
        Random rand = new Random();
        StringBuilder sb = new StringBuilder();

        switch (this.race){
            case HUMAN:
                sb.append(humanLines[rand.nextInt(humanLines.length)]).append("\n");
                break;
            case ELF:
                sb.append(elfLines[rand.nextInt(elfLines.length)]).append("\n");
                break;
            case DWARF:
                sb.append(dwarfLines[rand.nextInt(dwarfLines.length)]).append("\n");
                break;
            case ORC:
                sb.append(orcLines[rand.nextInt(orcLines.length)]).append("\n");
                break;
        }

        switch (this.characterClass){
            case WARRIOR:
                sb.append(warriorLines[rand.nextInt(warriorLines.length)]).append("\n");
                break;
            case MAGE:
                sb.append(mageLines[rand.nextInt(mageLines.length)]).append("\n");
                break;
            case ROGUE:
                sb.append(rogueLines[rand.nextInt(rogueLines.length)]).append("\n");
                break;
            case PRIEST:
                sb.append(priestLines[rand.nextInt(priestLines.length)]).append("\n");
                break;
        }

        switch (this.socialStatus){
            case NOBLE:
                sb.append(nobleLines[rand.nextInt(nobleLines.length)]).append("\n");
                break;
            case COMMONER:
                sb.append(commonerLines[rand.nextInt(commonerLines.length)]).append("\n");
                break;
            case OUTCAST:
                sb.append(outcastLines[rand.nextInt(outcastLines.length)]).append("\n");
                break;
        }

        switch (this.personality){
            case CHOLERIC:
                sb.append(cholericLines[rand.nextInt(cholericLines.length)]).append("\n");
                break;
            case MELANCHOLIC:
                sb.append(melancholicLines[rand.nextInt(melancholicLines.length)]).append("\n");
                break;
            case SANGUINE:
                sb.append(sanguineLines[rand.nextInt(sanguineLines.length)]).append("\n");
                break;
            case PHLEGMATIC:
                sb.append(phlegmaticLines[rand.nextInt(phlegmaticLines.length)]).append("\n");
                break;
        }

        switch (this.genre){
            case COMEDY:
                sb.append(comedyLines[rand.nextInt(comedyLines.length)]).append("\n");
                break;
            case DRAMA:
                sb.append(dramaLines[rand.nextInt(dramaLines.length)]).append("\n");
                break;
            case TRAGEDY:
                sb.append(tragedyLines[rand.nextInt(tragedyLines.length)]).append("\n");
                break;
            case NEUTRAL:
                sb.append(neutralLines[rand.nextInt(neutralLines.length)]).append("\n");
                break;
        }

        switch (this.backstoryType){
            case REALISTIC:
                sb.append(realisticBackstoryLines[rand.nextInt(realisticBackstoryLines.length)]).append("\n");
                break;
            case FANTASTIC:
                sb.append(fantasticBackstoryLines[rand.nextInt(fantasticBackstoryLines.length)]).append("\n");
                break;
        }

        return String.valueOf(sb);
    }

    enum Race {
        HUMAN, ELF, DWARF, ORC
    }

    enum CharacterClass {
        WARRIOR, MAGE, ROGUE, PRIEST
    }

    enum SocialStatus {
        NOBLE, COMMONER, OUTCAST
    }

    enum Personality {
        CHOLERIC, MELANCHOLIC, SANGUINE, PHLEGMATIC
    }

    enum Genre {
        COMEDY, DRAMA, TRAGEDY, NEUTRAL
    }

    enum BackstoryType {
        REALISTIC, FANTASTIC
    }

    private final String[] humanLines = new String[]{
            "Родился в небольшом городке, где каждый знал друг друга. Его жизнь была полна простых радостей и трудностей.",
            "Сын торговца, он мечтал о приключениях за пределами родного города.",
            "Родившись в семье ремесленников, он всегда мечтал о большем — о славе и богатстве.",
            "После потери близкого человека он поклялся защитить всех, кто нуждается в помощи.",
            "С детства обучаясь магии, он стал хранителем древних знаний своего народа."
    };

    private final String[] elfLines = new String[]{
            "В лесах древнего королевства, среди высоких деревьев, он научился понимать язык природы.",
            "Покинув родные земли, он искал свое место в мире людей и их странных обычаев.",
            "С ранних лет он изучал искусство магии и стал одним из самых могущественных волшебников своего народа.",
            "Его стремление к приключениям привело его к необычным встречам с другими расами.",
            "С детства обучаясь магии, он стал хранителем древних знаний своего народа."
    };

    private final String[] dwarfLines = new String[]{
            "В недрах гор, среди камней и металлов, он стал мастером своего дела, создавая удивительные артефакты.",
            "Обитая в подземных шахтах, он стал свидетелем древних тайн и легенд своего народа.",
            "Он был известен как лучший кузнец в своем клане и мечтал создать оружие, которое изменит ход истории.",
            "Его жизнь была полна трудностей, но каждый успех наполнял его гордостью за свой народ.",
            "Он всегда искал приключения за пределами своих гор, чтобы узнать больше о мире."
    };

    private final String[] orcLines = new String[]{
            "Вырастая в племени воинов, он с ранних лет учился искусству боя и чести.",
            "Сражаясь за выживание в жестоком мире, он стремился доказать свою ценность не только силой, но и умом.",
            "После предательства своего племени он поклялся отомстить тем, кто его обманул.",
            "Он всегда искал возможность стать лидером своего народа и объединить их против врагов.",
            "Его жизнь была полна сражений и испытаний, но он никогда не терял надежды на лучшее будущее."
    };

    private final String[] warriorLines = new String[]{
            "С юных лет он тренировался с мечом, мечтая стать защитником слабых.",
            "После потери близкого человека он поклялся защитить всех, кто нуждается в помощи.",
            "На поле боя его смелость вдохновляла других сражаться до последнего.",
            "Он всегда искал возможности проявить свои боевые навыки в честном поединке.",
            "Сражаясь за свою страну, он стал символом надежды для многих."
    };

    private final String[] mageLines = new String[]{
            "Открыв для себя тайны магии, он стремился постичь недоступные знания.",
            "Его страсть к изучению древних текстов привела к открытиям о забытых заклинаниях.",
            "Каждое новое заклинание открывало перед ним новые горизонты возможностей.",
            "Его эксперименты с магией иногда приводили к неожиданным последствиям.",
            "Он всегда искал способ использовать свою магию для помощи другим."
    };

    private final String[] rogueLines = new String[]{
            "Живя на грани закона, он использовал свои навыки для выживания в жестоком мире.",
            "Собирая информацию в тени, он стал мастером манипуляций и хитрости.",
            "Каждый новый день приносил ему новые возможности для приключений и заработка.",
            "Он часто попадал в неприятности из-за своей любопытной натуры и стремления к авантюрам.",
            "Его умение скрываться и незаметно передвигаться делало его незаменимым союзником."
    };

    private final String[] priestLines = new String[]{
            "Призванный служить богу, он искал ответы на вопросы о жизни и смерти.",
            "Вдохновленный священными видениями, он отправился в путешествие по святым местам.",
            "Каждое его слово было наполнено мудростью и состраданием к другим.",
            "Он всегда стремился помочь тем, кто потерял надежду на спасение.",
            "Его вера давала ему силы преодолевать любые трудности на пути."
    };

    private final String[] nobleLines = new String[]{
            "Родившись в знатной семье, он всегда чувствовал давление ожиданий окружающих.",
            "Его жизнь была полна роскоши, но внутри него всегда было чувство пустоты.",
            "Обремененный обязанностями своей семьи, он мечтал о приключениях вдали от дворца.",
            "Каждый вечер проходил под звуки балов и светские беседы казались ему скучными.",
            "Он часто задавался вопросом: что значит быть настоящим героем?"
    };

    private final String[] commonerLines = new String[]{
            "Он жил простой жизнью, работая на полях и мечтая о великих свершениях.",
            "Каждый день приносил новые трудности, но он не сдавался и продолжал бороться за лучшее будущее.",
            "Его трудолюбие и настойчивость помогли ему добиться успеха несмотря на все преграды.",
            "Он часто помогал соседям и считал это своим долгом перед обществом.",
            "Соседей не интересовали его мечты — они были заняты своими заботами и проблемами."
    };

    private final String[] outcastLines = new String[]{
            "Отверженный обществом, он искал свое место в мире среди тех, кто тоже был отвергнут.",
            "Он научился полагаться только на себя и своих единомышленников.",
            "Его странствия по миру были полны опасностей и неожиданных встреч с другими изгоями.",
            "Каждый новый день был борьбой за выживание в жестоком мире безжалостных людей.",
            "Он часто задумывался о том, что значит быть частью общества."
    };

    private final String[] cholericLines = new String[]{
            "С его вспыльчивым характером каждое новое приключение становилось настоящим испытанием для окружающих.",
            "Он был лидером по натуре и всегда стремился быть впереди всех в любых начинаниях.",
            "Стремление к действию иногда приводило его к конфликтам с более спокойными товарищами по команде.",
            "Его страсть к жизни заставляла его действовать быстро и решительно даже в самых сложных ситуациях.",
            "Он никогда не оставлял дела незавершенными — все должно быть сделано здесь и сейчас."
    };

    private final String[] melancholicLines = new String[]{
            "Он часто погружался в раздумья о жизни и смерти, что делало его мудрым собеседником.",
            "Его глубокие чувства иногда мешали ему принимать решения быстро и эффективно.",
            "Он искал смысл жизни через искусство и литературу, находя утешение в словах великих поэтов.",
            "Каждое его решение было обременено тяжелыми последствиями для любимых людей.",
            "Он часто задавался вопросом: как изменить мир к лучшему, если он сам не может найти свое место в нем."
    };

    private final String[] sanguineLines = new String[]{
            "Его оптимизм и жизнерадостность притягивали людей к нему как магнитом.",
            "Он всегда находил способ поднять настроение своим друзьям даже в самые трудные времена.",
            "Смех и радость были его постоянными спутниками, и он делился ими с окружающими.",
            "Он легко заводил знакомства и умел находить общий язык с любым человеком.",
            "Каждое новое приключение воспринималось им как возможность для веселья и радости."
    };

    private final String[] phlegmaticLines = new String[]{
            "Спокойствие и уравновешенность позволяли ему оставаться хладнокровным даже в самых сложных ситуациях.",
            "Его терпение позволяло ему находить выход из самых запутанных ситуаций без лишней суеты.",
            "Он всегда был тем, кто слушает и поддерживает, когда другим нужно плечо для опоры.",
            "Его медлительность иногда вызывала недовольство, но он знал, что спешка не приводит к хорошему результату.",
            "В любой ситуации он сохранял спокойствие и рассудительность, что делало его надежным другом."
    };

    private final String[] comedyLines = new String[]{
            "Его жизнь была полна смешных ситуаций и нелепых недоразумений, которые заставляли смеяться даже врагов.",
            "Неудачные попытки завести отношения превращались в настоящие комические ситуации.",
            "Случайные встречи с эксцентричными персонажами превращали каждую его поездку в захватывающее приключение.",
            "Каждый новый день приносил новые поводы для смеха и радости.",
            "Он всегда искал возможность пошутить, даже в самых серьезных ситуациях."
    };

    private final String[] dramaLines = new String[]{
            "Каждое его решение было обременено тяжелыми последствиями для любимых людей.",
            "Столкнувшись с предательством лучшего друга, он оказался на грани разрыва между долгом и дружбой.",
            "Постоянная борьба за справедливость привела его к множеству моральных дилемм.",
            "Его жизнь была полна страданий, но он никогда не терял надежды на лучшее будущее.",
            "Каждый шаг приближал его к разгадке тайны, которая изменила бы все."
    };

    private final String[] tragedyLines = new String[]{
            "Несмотря на все усилия изменить свою судьбу, ему суждено было столкнуться с горькими утратами.",
            "Каждая победа давалась ему слишком дорогой ценой — потерей близких или надежд на будущее.",
            "Столкнувшись с трагическими событиями, он искал утешение в воспоминаниях о счастье.",
            "Его жизнь была полна потерь, но каждая утрата делала его сильнее и мудрее.",
            "Он всегда задавался вопросом: почему судьба так жестока к тем, кто стремится к добру?"
    };

    private final String[] neutralLines = new String[]{
            "Его жизнь была полна рутинных событий — работа, дом, друзья.",
            "Он просто жил своей жизнью без особых взлетов или падений — день за днем как все остальные.",
            "Каждый день приносил одно и то же: трудности на работе и радости дома.",
            "Он не искал приключений, предпочитая стабильность и предсказуемость.",
            "В его жизни не было ничего выдающегося — просто обычные будни."
    };

    private final String[] realisticBackstoryLines = new String[]{
            "Он вырос среди обычных людей и научился ценить простые радости жизни.",
            "Работая на ферме, он узнал цену труда и упорства.",
            "Потеря работы подтолкнула его к поиску новых путей самореализации.",
            "Каждый новый день приносил новые испытания, но он не сдавался перед трудностями.",
            "Жизнь в городе научила его быть осторожным и расчетливым."
    };

    private final String[] fantasticBackstoryLines = new String[]{
            "В один прекрасный день ему открылись тайные силы древней магии.",
            "После встречи с таинственным существом его жизнь изменилась навсегда.",
            "Путешествуя по мирам с помощью магического артефакта, он открыл для себя множество чудес.",
            "Его судьба переплелась с судьбами мифических существ, которые стали его союзниками.",
            "Невероятные приключения ожидали его за каждым углом — от волшебных лесов до затерянных городов."
    };
}
