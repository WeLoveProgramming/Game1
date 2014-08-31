Game1
===========
Objects:
 
  avator:
  
    HP
    Weapon
    xpos, ypos //determines point of view
  
  Weapon:
  
    damage
    isActive
    
  obsticales:
  
    xpos, ypos, tickAction()
    
  enimes extands obsticales:
  
    @inherated
    xpos, ypos
    @new members
    directionMoving
    @override
    tickAction()
    
Compointants:

  On every tick:
  
    Backgroud picture, a picture that is continous, ypos--
    obsticales and enimes, ypos--.  
    enimes.move()
    if weapon collies, then enimes.ypos++ and enimes.hp--
    if avator collies, then backgound.ypos++,avator.hp--, enimes.ypos++, obsticale.ypos++
    if weapon.active==true then weapon.contineSwipe()
  
  Tilt left:
  
    then enimes.xpos--, obsticale.xpos--, backgound.xpos--
   
  Tilt right:
  
     then enimes.xpos++, obsticale.xpos++, backgound.xpos++
   
  Tap:
  
     then wapan.create, weapon.swipe
  
  EventWhenHP==0:
  
     GameOver()
      ScoreOutput()
