# Caesar-cipher
In cryptography, a Caesar cipher, also known as Caesar's cipher, the shift cipher, Caesar's code or Caesar shift, is one of the simplest and most widely known encryption techniques.
# Example
The transformation can be represented by aligning two alphabets; the cipher alphabet is the plain alphabet rotated left or right by some number of positions. For instance, here is a Caesar cipher using a left rotation of three places, equivalent to a right shift of 23 (the shift parameter is used as the key ):

Plain	A	B	C	D	E	F	G	H	I	J	K	L	M	N	O	P	Q	R	S	T	U	V	W	X	Y	Z <br> 
Cipher	X	Y	Z	A	B	C	D	E	F	G	H	I	J	K	L	M	N	O	P	Q	R	S	T	U	V	W <br> 
When encrypting, a person looks up each letter of the message in the "plain" line and writes down the corresponding letter in the "cipher" line.

Plaintext:  THE QUICK BROWN FOX JUMPS OVER THE LAZY DOG
Ciphertext: QEB NRFZH YOLTK CLU GRJMP LSBO QEB IXWV ALD
Deciphering is done in reverse, with a right shift of 3.

The encryption can also be represented using modular arithmetic by first transforming the letters into numbers, according to the scheme, A → 0, B → 1, ..., Z → 25.[2] Encryption of a letter x by a shift n can be described mathematically as,[3]

{\displaystyle E_{n}(x)=(x+n)\mod {26}.}E_{n}(x)=(x+n)\mod {26}.
Decryption is performed similarly,

{\displaystyle D_{n}(x)=(x-n)\mod {26}.}D_{n}(x)=(x-n)\mod {26}.
(There are different definitions for the modulo operation. In the above, the result is in the range 0 to 25; i.e., if x + n or x − n are not in the range 0 to 25, we have to subtract or add 26.)

The replacement remains the same throughout the message, so the cipher is classed as a type of monoalphabetic substitution, as opposed to polyalphabetic substitution.
# History and usage
![Logo](https://upload.wikimedia.org/wikipedia/commons/thumb/b/b4/Bust_of_Julius_Caesar_from_History_of_the_World_%281902%29.png/220px-Bust_of_Julius_Caesar_from_History_of_the_World_%281902%29.png)





See also: History of cryptography

The Caesar cipher is named for Julius Caesar, who used an alphabet where decrypting would shift three letters to the left.
The Caesar cipher is named after Julius Caesar, who, according to Suetonius, used it with a shift of three (A becoming D when encrypting, and D becoming A when decrypting) to protect messages of military significance. While Caesar's was the first recorded use of this scheme, other substitution ciphers are known to have been used earlier.<br>
![Logo](https://upload.wikimedia.org/wikipedia/commons/thumb/b/b5/CipherDisk2000.jpg/220px-CipherDisk2000.jpg)<br>

"If he had anything confidential to say, he wrote it in cipher, that is, by so changing the order of the letters of the alphabet, that not a word could be made out. If anyone wishes to decipher these, and get at their meaning, he must substitute the fourth letter of the alphabet, namely D, for A, and so with the others."


— Suetonius, Life of Julius Caesar 56
His nephew, Augustus, also used the cipher, but with a right shift of one, and it did not wrap around to the beginning of the alphabet:

"Whenever he wrote in cipher, he wrote B for A, C for B, and the rest of the letters on the same principle, using AA for Z."

— Suetonius, Life of Augustus 88
Evidence exists that Julius Caesar also used more complicated systems,[6] and one writer, Aulus Gellius, refers to a (now lost) treatise on his ciphers:

"There is even a rather ingeniously written treatise by the grammarian Probus concerning the secret meaning of letters in the composition of Caesar's epistles."

— Aulus Gellius, Attic Nights 17.9.1–5
It is unknown how effective the Caesar cipher was at the time, but it is likely to have been reasonably secure, not least because most of Caesar's enemies would have been illiterate and others would have assumed that the messages were written in an unknown foreign language.[7] There is no record at that time of any techniques for the solution of simple substitution ciphers. The earliest surviving records date to the 9th-century works of Al-Kindi in the Arab world with the discovery of frequency analysis.[8]

A Caesar cipher with a shift of one is used on the back of the mezuzah to encrypt the names of God. This may be a holdover from an earlier time when Jewish people were not allowed to have mezuzot. The letters of the cryptogram themselves comprise a religiously significant "divine name" which Orthodox belief holds keeps the forces of evil in check.[9]

In the 19th century, the personal advertisements section in newspapers would sometimes be used to exchange messages encrypted using simple cipher schemes. Kahn (1967) describes instances of lovers engaging in secret communications enciphered using the Caesar cipher in The Times.[10] Even as late as 1915, the Caesar cipher was in use: the Russian army employed it as a replacement for more complicated ciphers which had proved to be too difficult for their troops to master; German and Austrian cryptanalysts had little difficulty in decrypting their messages.[11]


A construction of two rotating disks with a Caesar cipher can be used to encrypt or decrypt the code.
Caesar ciphers can be found today in children's toys such as secret decoder rings. A Caesar shift of thirteen is also performed in the ROT13 algorithm, a simple method of obfuscating text widely found on Usenet and used to obscure text (such as joke punchlines and story spoilers), but not seriously used as a method of encryption.[12]

The Vigenère cipher uses a Caesar cipher with a different shift at each position in the text; the value of the shift is defined using a repeating keyword. If the keyword is as long as the message, is chosen at random, never becomes known to anyone else, and is never reused, this is the one-time pad cipher, proven unbreakable. The conditions are so difficult they are, in practical effect, never achieved. Keywords shorter than the message (e.g., "Complete Victory" used by the Confederacy during the American Civil War), introduce a cyclic pattern that might be detected with a statistically advanced version of frequency analysis.[13]

In April 2006, fugitive Mafia boss Bernardo Provenzano was captured in Sicily partly because some of his messages, clumsily written in a variation of the Caesar cipher, were broken. Provenzano's cipher used numbers, so that "A" would be written as "4", "B" as "5", and so on.[14]

In 2011, Rajib Karim was convicted in the United Kingdom of "terrorism offences" after using the Caesar cipher to communicate with Bangladeshi Islamic activists discussing plots to blow up British Airways planes or disrupt their IT networks. Although the parties had access to far better encryption techniques (Karim himself used PGP for data storage on computer disks), they chose to use their own scheme (implemented in Microsoft Excel), rejecting a more sophisticated code program called Mujahedeen Secrets "because 'kaffirs', or non-believers, know about it, so it must be less secure".[15] This constituted an application of security through obscurity.