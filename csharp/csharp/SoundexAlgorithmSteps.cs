using System;
using TechTalk.SpecFlow;

namespace csharp
{
    [Binding]
    public class SoundexAlgorithmSteps
    {
        [Given(@"A soundex instance")]
        public void GivenASoundexInstance()
        {
            ScenarioContext.Current.Pending();
        }
        
        [When(@"I enter a word as ""(.*)""")]
        public void WhenIEnterAWordAs(string p0)
        {
            ScenarioContext.Current.Pending();
        }
        
        [When(@"I enter the word ""(.*)""")]
        public void WhenIEnterTheWord(string p0)
        {
            ScenarioContext.Current.Pending();
        }
        
        [When(@"I enter the lower case word ""(.*)""")]
        public void WhenIEnterTheLowerCaseWord(string p0)
        {
            ScenarioContext.Current.Pending();
        }
        
        [When(@"I enter the character ""(.*)""")]
        public void WhenIEnterTheCharacter(string p0)
        {
            ScenarioContext.Current.Pending();
        }
        
        [When(@"I enter the string ""(.*)""")]
        public void WhenIEnterTheString(string p0)
        {
            ScenarioContext.Current.Pending();
        }
        
        [Then(@"it is encoded to ""(.*)""")]
        public void ThenItIsEncodedTo(string p0)
        {
            ScenarioContext.Current.Pending();
        }
        
        [Then(@"the encoded length is equal to ""(.*)""")]
        public void ThenTheEncodedLengthIsEqualTo(string p0)
        {
            ScenarioContext.Current.Pending();
        }
        
        [Then(@"the encoded first letter is equal to ""(.*)""")]
        public void ThenTheEncodedFirstLetterIsEqualTo(string p0)
        {
            ScenarioContext.Current.Pending();
        }
        
        [Then(@"it is equal to other encoded character ""(.*)""")]
        public void ThenItIsEqualToOtherEncodedCharacter(string p0)
        {
            ScenarioContext.Current.Pending();
        }
        
        [Then(@"it is equal to other encoded string ""(.*)""")]
        public void ThenItIsEqualToOtherEncodedString(string p0)
        {
            ScenarioContext.Current.Pending();
        }
    }
}
