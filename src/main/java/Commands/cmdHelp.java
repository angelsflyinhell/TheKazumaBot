package Commands;

import Util.STATIC;
import net.dv8tion.jda.core.EmbedBuilder;
import net.dv8tion.jda.core.events.message.MessageReceivedEvent;

public class cmdHelp implements Command {
    @Override
    public boolean called(String[] args, MessageReceivedEvent event) {
        return false;
    }

    @Override
    public void action(String[] args, MessageReceivedEvent event) {

        if(args.length == 0) {
            event.getTextChannel().sendMessage(

                    new EmbedBuilder()

                            .setTitle("Commandlist")
                            .setDescription("This is a list of all my current commands! My Prefix is " + STATIC.PREFIX)
                            .addField("Bot Commands", "``about``, ``db``, ``discordbots``", true)
                            .addField("Moderation Commands", "``setjoinmessage``, ``announcechannel``, ``setleavemessage``", true)
                            .addField("Fun Commands", "``8ball``, ``ratewaifu``, ``ship``, ``japanese``", true)
                            .addField("Kawaii Commands", "``hug``, ``kiss``, ``cuddle``, ``highfive``, ``lick``, ``hello``, ``nom``, ``pat``, ``slap``, ``tickle``, ``nosebleed``, ``dance``, ``baka``, ``cry``", true)
                            .addField("Audit Log", "You can create a channel with the name 'kazuma-log' to activate the auditlog", true)
                            .addField("Help Command", "Use ``" + STATIC.PREFIX + "help <command>`` to get information about a specific command! (Don't include ``<`` or ``>``)", true)

                    .build()

            ).queue();
        }else {
            switch (args[0]) {
                case "about":
                    event.getTextChannel().sendMessage(

                            new EmbedBuilder()
                                    .setTitle("Command information")
                                    .setDescription("Usage: ``" + STATIC.PREFIX + args[0] + "``")
                                    .addField("Required Permission", "``/``", false)
                                    .addField("Category", "``Bot Commands``", false)
                                    .addField("Aliases", "``/``", false)
                            .build()

                    ).queue();
                    break;

                case "db":
                case "discordbots":
                    event.getTextChannel().sendMessage(

                            new EmbedBuilder()
                                    .setTitle("Command information")
                                    .setDescription("Usage: ``" + STATIC.PREFIX + args[0] + "``")
                                    .addField("Required Permission", "``/``", false)
                                    .addField("Category", "``Bot Commands``", false)
                                    .addField("Aliases", "``db``", false)
                                    .build()

                    ).queue();
                    break;

                case "8ball":
                    event.getTextChannel().sendMessage(

                            new EmbedBuilder()
                                    .setTitle("Command information")
                                    .setDescription("Usage: ``" + STATIC.PREFIX + args[0] + " <question>``")
                                    .addField("Required Permission", "``/``", false)
                                    .addField("Category", "``Fun Commands``", false)
                                    .addField("Aliases", "``/``", false)
                                    .build()

                    ).queue();
                    break;

                case "ratewaifu":
                    event.getTextChannel().sendMessage(

                            new EmbedBuilder()
                                    .setTitle("Command information")
                                    .setDescription("Usage: ``" + STATIC.PREFIX + args[0] + " <mention>``")
                                    .addField("Required Permission", "``/``", false)
                                    .addField("Category", "``Fun Commands``", false)
                                    .addField("Aliases", "``/``", false)
                                    .build()

                    ).queue();
                    break;

                case "ship":
                    event.getTextChannel().sendMessage(

                            new EmbedBuilder()
                                    .setTitle("Command information")
                                    .setDescription("Usage: ``" + STATIC.PREFIX + args[0] + " <mention>``")
                                    .addField("Required Permission", "``/``", false)
                                    .addField("Category", "``Fun Commands``", false)
                                    .addField("Aliases", "``/``", false)
                                    .build()

                    ).queue();
                    break;

                case "japanese":
                    event.getTextChannel().sendMessage(

                            new EmbedBuilder()
                                    .setTitle("Command information")
                                    .setDescription("Usage: ``" + STATIC.PREFIX + args[0] + " <statement>``")
                                    .addField("Required Permission", "``/``", false)
                                    .addField("Category", "``Bot Commands``", false)
                                    .addField("Aliases", "``/``", false)
                                    .build()

                    ).queue();
                    break;

                case "hug":
                    event.getTextChannel().sendMessage(

                            new EmbedBuilder()
                                    .setTitle("Command information")
                                    .setDescription("Usage: ``" + STATIC.PREFIX + args[0] + " <mention>``")
                                    .addField("Required Permission", "``/``", false)
                                    .addField("Category", "``Kawaii Commands``", false)
                                    .addField("Aliases", "``/``", false)
                                    .build()

                    ).queue();
                    break;

                case "baka":
                    event.getTextChannel().sendMessage(

                            new EmbedBuilder()
                                    .setTitle("Command information")
                                    .setDescription("Usage: ``" + STATIC.PREFIX + args[0] + " <mention>``")
                                    .addField("Required Permission", "``/``", false)
                                    .addField("Category", "``Kawaii Commands``", false)
                                    .addField("Aliases", "``/``", false)
                                    .build()

                    ).queue();
                    break;

                case "cry":
                    event.getTextChannel().sendMessage(

                            new EmbedBuilder()
                                    .setTitle("Command information")
                                    .setDescription("Usage: ``" + STATIC.PREFIX + args[0] + " <mention>``")
                                    .addField("Required Permission", "``/``", false)
                                    .addField("Category", "``Kawaii Commands``", false)
                                    .addField("Aliases", "``/``", false)
                                    .build()

                    ).queue();
                    break;

                case "cuddle":
                    event.getTextChannel().sendMessage(

                            new EmbedBuilder()
                                    .setTitle("Command information")
                                    .setDescription("Usage: ``" + STATIC.PREFIX + args[0] + " <mention>``")
                                    .addField("Required Permission", "``/``", false)
                                    .addField("Category", "``Kawaii Commands``", false)
                                    .addField("Aliases", "``/``", false)
                                    .build()

                    ).queue();
                    break;

                case "dance":
                    event.getTextChannel().sendMessage(

                            new EmbedBuilder()
                                    .setTitle("Command information")
                                    .setDescription("Usage: ``" + STATIC.PREFIX + args[0] + " <mention>``")
                                    .addField("Required Permission", "``/``", false)
                                    .addField("Category", "``Kawaii Commands``", false)
                                    .addField("Aliases", "``/``", false)
                                    .build()

                    ).queue();
                    break;

                case "hello":
                    event.getTextChannel().sendMessage(

                            new EmbedBuilder()
                                    .setTitle("Command information")
                                    .setDescription("Usage: ``" + STATIC.PREFIX + args[0] + " <mention>``")
                                    .addField("Required Permission", "``/``", false)
                                    .addField("Category", "``Kawaii Commands``", false)
                                    .addField("Aliases", "``/``", false)
                                    .build()

                    ).queue();
                    break;

                case "highfive":
                    event.getTextChannel().sendMessage(

                            new EmbedBuilder()
                                    .setTitle("Command information")
                                    .setDescription("Usage: ``" + STATIC.PREFIX + args[0] + " <mention>``")
                                    .addField("Required Permission", "``/``", false)
                                    .addField("Category", "``Kawaii Commands``", false)
                                    .addField("Aliases", "``/``", false)
                                    .build()

                    ).queue();
                    break;

                case "kiss":
                    event.getTextChannel().sendMessage(

                            new EmbedBuilder()
                                    .setTitle("Command information")
                                    .setDescription("Usage: ``" + STATIC.PREFIX + args[0] + " <mention>``")
                                    .addField("Required Permission", "``/``", false)
                                    .addField("Category", "``Kawaii Commands``", false)
                                    .addField("Aliases", "``/``", false)
                                    .build()

                    ).queue();
                    break;

                case "lick":
                    event.getTextChannel().sendMessage(

                            new EmbedBuilder()
                                    .setTitle("Command information")
                                    .setDescription("Usage: ``" + STATIC.PREFIX + args[0] + " <mention>``")
                                    .addField("Required Permission", "``/``", false)
                                    .addField("Category", "``Kawaii Commands``", false)
                                    .addField("Aliases", "``/``", false)
                                    .build()

                    ).queue();
                    break;

                case "nom":
                    event.getTextChannel().sendMessage(

                            new EmbedBuilder()
                                    .setTitle("Command information")
                                    .setDescription("Usage: ``" + STATIC.PREFIX + args[0] + " <mention>``")
                                    .addField("Required Permission", "``/``", false)
                                    .addField("Category", "``Kawaii Commands``", false)
                                    .addField("Aliases", "``/``", false)
                                    .build()

                    ).queue();
                    break;

                case "nosebleed":
                    event.getTextChannel().sendMessage(

                            new EmbedBuilder()
                                    .setTitle("Command information")
                                    .setDescription("Usage: ``" + STATIC.PREFIX + args[0] + " <mention>``")
                                    .addField("Required Permission", "``/``", false)
                                    .addField("Category", "``Kawaii Commands``", false)
                                    .addField("Aliases", "``/``", false)
                                    .build()

                    ).queue();
                    break;

                case "pat":
                    event.getTextChannel().sendMessage(

                            new EmbedBuilder()
                                    .setTitle("Command information")
                                    .setDescription("Usage: ``" + STATIC.PREFIX + args[0] + " <mention>``")
                                    .addField("Required Permission", "``/``", false)
                                    .addField("Category", "``Kawaii Commands``", false)
                                    .addField("Aliases", "``/``", false)
                                    .build()

                    ).queue();
                    break;

                case "slap":
                    event.getTextChannel().sendMessage(

                            new EmbedBuilder()
                                    .setTitle("Command information")
                                    .setDescription("Usage: ``" + STATIC.PREFIX + args[0] + " <mention>``")
                                    .addField("Required Permission", "``/``", false)
                                    .addField("Category", "``Kawaii Commands``", false)
                                    .addField("Aliases", "``/``", false)
                                    .build()

                    ).queue();
                    break;

                case "tickle":
                    event.getTextChannel().sendMessage(

                            new EmbedBuilder()
                                    .setTitle("Command information")
                                    .setDescription("Usage: ``" + STATIC.PREFIX + args[0] + " <mention>``")
                                    .addField("Required Permission", "``/``", false)
                                    .addField("Category", "``Kawaii Commands``", false)
                                    .addField("Aliases", "``/``", false)
                                    .build()

                    ).queue();
                    break;

                case "setjoinmessage":
                    event.getTextChannel().sendMessage(

                            new EmbedBuilder()
                                    .setTitle("Command information")
                                    .setDescription("Usage: ``" + STATIC.PREFIX + args[0] + " <mention>``")
                                    .addField("Required Permission", "``MANAGE_SERVER``", false)
                                    .addField("Category", "``Moderation Commands``", false)
                                    .addField("Aliases", "``/``", false)
                                    .build()

                    ).queue();
                    break;

                case "announcechannel":
                    event.getTextChannel().sendMessage(

                            new EmbedBuilder()
                                    .setTitle("Command information")
                                    .setDescription("Usage: ``" + STATIC.PREFIX + args[0] + " <mention>``")
                                    .addField("Required Permission", "``MANAGE_SERVER``", false)
                                    .addField("Category", "``Moderation Commands``", false)
                                    .addField("Aliases", "``/``", false)
                                    .build()

                    ).queue();
                    break;

                case "setleavemessage":
                    event.getTextChannel().sendMessage(

                            new EmbedBuilder()
                                    .setTitle("Command information")
                                    .setDescription("Usage: ``" + STATIC.PREFIX + args[0] + " <mention>``")
                                    .addField("Required Permission", "``MANAGE_SERVER``", false)
                                    .addField("Category", "``Moderation Commands``", false)
                                    .addField("Aliases", "``/``", false)
                                    .build()

                    ).queue();
                    break;

            }
        }

    }

    @Override
    public void executed(boolean success, MessageReceivedEvent event) {

    }
}