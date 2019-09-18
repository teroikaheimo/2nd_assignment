# layoutTehtava
Mobile Programming Assigment #2

Create a new Android program called "LayoutTehtava"

The main screen divides into four rectangle-shaped sections each of equal area. Make the background of all four (4) sections slightly different colour so the division between sections can be seen.

Section 1 consists of a button (button1) in the middle of the section (no hardcoded positioning or constraintlayout).

Section 2 consists of a picture (picture1) (any picture smaller than the section will do) in the lower-right corner of the section (again no hardcoded positioning or constraintlayout).

Section 3 divides into two sub-sections horizontally (so that the sub-sections are on top of each other) taking equal area of their parent section, both sections are of different colour from other sections and each other.

Section 4 has two buttons (button2 and button3) which fill the whole section so that other takes 40% of the section and other 60% of the section.

Button1 enables/disables button2 and button3. Button2 hides picture1 and button3 shows picture1 again if it's hidden. Button3 only accepts long pushes of the button. Normal quick click does not do anything.

All four main sections need to retain the same area on the screen even if the device orientation changes. This means that the dimensions of the layouts may not be hardcoded.
