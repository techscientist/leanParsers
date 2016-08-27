import java.util.ArrayList;

class RootModel {

	public ArrayList<Social_linksModel> social_links;
	public String location_name;
	public String logo;
	public VersionModel _version;
	public String topic;
	public String start_time;
	public Call_for_papersModel _call_for_papers;
	public int id;
	public String end_time;
	public String state;
	public String schedule_published_on;
	public String name;
	public String description;
	public String background_image;
	public String privacy;
	public String organizer_description;
	public String code_of_conduct;
	public CopyrightModel _copyright;
	public String organizer_name;
	public CreatorModel _creator;
	public String type;
	public String email;
	public String timezone;

	public RootModel(ArrayList<Social_linksModel> social_links, String location_name, String logo, VersionModel version, String topic, String start_time, Call_for_papersModel call_for_papers, int id, String end_time, String state, String schedule_published_on, String name, String description, String background_image, String privacy, String organizer_description, String code_of_conduct, CopyrightModel copyright, String organizer_name, CreatorModel creator, String type, String email, String timezone) {

		this.social_links = social_links;
		this.location_name = location_name;
		this.logo = logo;
		this._version = version;
		this.topic = topic;
		this.start_time = start_time;
		this._call_for_papers = call_for_papers;
		this.id = id;
		this.end_time = end_time;
		this.state = state;
		this.schedule_published_on = schedule_published_on;
		this.name = name;
		this.description = description;
		this.background_image = background_image;
		this.privacy = privacy;
		this.organizer_description = organizer_description;
		this.code_of_conduct = code_of_conduct;
		this._copyright = copyright;
		this.organizer_name = organizer_name;
		this._creator = creator;
		this.type = type;
		this.email = email;
		this.timezone = timezone;

	}

}