package sample;

import com.google.gson.JsonObject;
import com.google.gson.JsonParser;

import java.util.Random;

/**
 * Created by sachin on 4/12/16.
 */
public class Paragraphs {

    static String [] keys=new String[]{"Moon","Sun","Solar System","Mahabharata","Ramayana","The Taj Mahal","Delhi","Doctor","Farmer"};


    public static String type1="{\n" +
            "  \"Moon\":\"The Moon is a barren, rocky world without air and water. It has dark lava plain on its surface. The Moon is filled with craters. It has no light of its own. It gets its light from the Sun. The Moo keeps changing its shape as it moves round the Earth. It spins on its axis in 27.3 days stars were named after the Edwin Aldrin were the first ones to set their foot on the Moon on 21 July 1969 They reached the Moon in their space craft named Apollo II.\",\n" +
            "  \"Sun\":\"The sun is a huge ball of gases. It has a diameter of 1,392,000 km. It is so huge that it can hold millions of planets inside it. The Sun is mainly made up of hydrogen and helium gas. The surface of the Sun is known as the photosphere. The photosphere is surrounded by a thin layer of gas known as the chromospheres. Without the Sun, there would be no life on Earth. There would be no plants, no animals and no human beings. As, all the living things on Earth get their energy from the Sun for their survival.\",\n" +
            "  \"Solar System\":\"The Solar System consists of the Sun Moon and Planets. It also consists of comets, meteoroids and asteroids. The Sun is the largest member of the Solar System. In order of distance from the Sun, the planets are Mercury, Venus, Earth, Mars, Jupiter, Saturn, Uranus, Neptune and Pluto; the dwarf planet. The Sun is at the centre of the Solar System and the planets, asteroids, comets and meteoroids revolve around it.\",\n" +
            "  \"Mahabharata\":\"The Mahabharata is a story about a great battle between the Kauravas and the Pandavas. The battle was fought in Kurukshetra near Delhi. Many kings and princes took part in the battle. The Pandavas defeated the Kauravas. The Bhagvad Gita is a holy book of the Hindus. It is a part of the Mahabharata. Then, Lord Rama, with the help of It is a book of collection of teachings of Lord Krishna to Arjuna in the battlefield. It is the longest epic in the world.\",\n" +
            "  \"Ramayana\":\"The Ramayana is a story of Lord Rama written by the SageValmiki. Lord Rama, the prince of Ayodhya, in order to help his father Dasharatha went to exile for fourteen years. His wife, Sita and his younger brother Lakshmana also went with him. He went through many difficulties in the forest. One day Ravana, the king of Lanka carried away Sita with him. Then, Lord Rama, with the help of Hanumana, defeated and killed Ravana; Sita, Rama and Lakshmana returned to Ayod hya after their exile.\",\n" +
            "  \"The Taj Mahal\":\"The Taj Mahal is a beautiful monument built in 1631 by an Emperor named Shah Jahan in memory of his wife Mumtaz Mahal. It is situated on the banks of river Yamuna at Agra. It looks beautiful in the moonlight. The Taj Mahal is made up of white marble. In front of the monument, there is a beautiful garden known as the Charbagh. Inside the monument, there are two tombs. These tombs are of Shah Jahan and his wife Mumtaz Mahal. The Taj Mahal is considered as one of the Seven Wonders of the World. Many tourists come to see this beautiful structure from different parts of the world.\",\n" +
            "  \"Delhi\":\"Delhi is the capital of India. It is situated on the banks of the river Yamuna. It is surrounded by Haryanaand Uttar Pradesh. It has some of the famous buildings and monuments such as the Qutub Minar, Reu Fort, Lotus Temple, Akshardham Temple etc. Some of the monuments are hundreds of years old. Apart from this, there is the Parliament House, the Central Secretariat and the famous Connaught place. Delhi is a beautiful city. But, it is becoming very crowded and polluted. I love Delhi a lot.\",\n" +
            "  \"Doctor\":\"The doctor is a person who looks after the sick people and prescribes medicines so that the patient recovers fast. In order to become a doctor, a person has to study medicine. Doctors lead a hard life. Their life is very busy. They get up early in the morning and go to the hospital. They work without taking a break. They always remain polite so that patients feel comfortable with them. Since doctors work so hard we must realise their value.\",\n" +
            "  \"Farmer\":\"India is an agricultural country. Most of the people live in villages and are farmers. They grow cereals, pulses, vegetables and fruits. The farmers lead a tough life. They get up early in the morning and go to the fields. They stay and work on the farm late till evening. The farmers usually live in kuchcha houses. Though, they work hard they remain poor. Farmers eat simple food; wear simple clothes and rear animals like cows, buffaloes and oxen. Without them there would be no cereals for us to eat. They play an important role in the growth and economy of a country.\"\n" +
            "}";

    public static String getrandompara(){
        JsonObject object=new JsonParser().parse(type1).getAsJsonObject();
        int randomNum = new Random().nextInt(9);
        return object.get(keys[randomNum]).getAsString();
    }

}
