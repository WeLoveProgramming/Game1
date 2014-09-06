Game1
===========
Objects:
 
  Avatar:
  
    HP
    Weapon
    xpos, ypos //determines point of view
  
  Weapon:
  
    damage
    isActive
    
  Obstacles:
  
    xpos, ypos, tickAction()
    
  Enemies extends Obstacles:
  
    @inherited
    xpos, ypos
    @new members
    directionMoving
    @override
    tickAction()
    
Components:

  On every tick:
  
    Background picture, a looping picture that is continous, ypos--
    Obstacles and enimes, ypos--.  
    enimes.move()
    if weapon collides, then enemies.ypos++ and enemies.hp--
    if avatar collides, then backgound.ypos++,avatar.hp--, enemies.ypos++, obstacle.ypos++
    if weapon.active==true then weapon.continueSwipe()
  
  Tilt left:
  
    then enemies.xpos--, obstacle.xpos--, backgound.xpos--
   
  Tilt right:
  
     then enemies.xpos++, obsticle.xpos++, backgound.xpos++
   
  Tap:
  
     then weapon.create, weapon.swipe(int degree)
  
  EventWhenHP==0:
  
     GameOver()
     ScoreOutput()
