class Skill
{

 String skillName;

 Skill(){}
 Skill(String skillName)
 {
  this.skillName=skillName;
 }

 public void setSkillName(String skillName)
 {
  this.skillName=skillName;
 }
 public String getSkillName()
 {
  return skillName;
 }
  public String toString()
 {
 //fill your code
	 return String.format("%-15s",this.skillName);
 }


}

