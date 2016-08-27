import java.util.ArrayList;

class RootModel {

	public String privacy;
	public String logo;
	public String end_time;
	public String background_image;
	public String start_time;
	public String state;
	public CopyrightModel _copyright;
	public String organizer_name;
	public String location_name;
	public ArrayList<Social_linksModel> social_links;
	public String schedule_published_on;
	public Call_for_papersModel _call_for_papers;
	public String code_of_conduct;
	public String type;
	public String name;
	public String description;
	public String topic;
	public String organizer_description;
	public String timezone;
	public CreatorModel _creator;
	public int id;
	public String email;
	public VersionModel _version;

	public RootModel(String privacy, String logo, String end_time, String background_image, String start_time, String state, CopyrightModel copyright, String organizer_name, String location_name, ArrayList<Social_linksModel> social_links, String schedule_published_on, Call_for_papersModel call_for_papers, String code_of_conduct, String type, String name, String description, String topic, String organizer_description, String timezone, CreatorModel creator, int id, String email, VersionModel version) {

		this.privacy = privacy;
		this.logo = logo;
		this.end_time = end_time;
		this.background_image = background_image;
		this.start_time = start_time;
		this.state = state;
		this._copyright = copyright;
		this.organizer_name = organizer_name;
		this.location_name = location_name;
		this.social_links = social_links;
		this.schedule_published_on = schedule_published_on;
		this._call_for_papers = call_for_papers;
		this.code_of_conduct = code_of_conduct;
		this.type = type;
		this.name = name;
		this.description = description;
		this.topic = topic;
		this.organizer_description = organizer_description;
		this.timezone = timezone;
		this._creator = creator;
		this.id = id;
		this.email = email;
		this._version = version;

	}

}