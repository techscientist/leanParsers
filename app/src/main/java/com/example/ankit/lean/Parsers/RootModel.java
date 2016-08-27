import java.util.ArrayList;

class RootModel {

	public String organizer_name;
	public String end_time;
	public String background_image;
	public String schedule_published_on;
	public ArrayList<Social_linksModel> social_links;
	public String topic;
	public String organizer_description;
	public String email;
	public String type;
	public String logo;
	public VersionModel _version;
	public String privacy;
	public String code_of_conduct;
	public String state;
	public String timezone;
	public String start_time;
	public int id;
	public CopyrightModel _copyright;
	public Call_for_papersModel _call_for_papers;
	public String name;
	public String description;
	public String location_name;
	public CreatorModel _creator;

	public RootModel(String organizer_name, String end_time, String background_image, String schedule_published_on, ArrayList<Social_linksModel> social_links, String topic, String organizer_description, String email, String type, String logo, VersionModel version, String privacy, String code_of_conduct, String state, String timezone, String start_time, int id, CopyrightModel copyright, Call_for_papersModel call_for_papers, String name, String description, String location_name, CreatorModel creator) {

		this.organizer_name = organizer_name;
		this.end_time = end_time;
		this.background_image = background_image;
		this.schedule_published_on = schedule_published_on;
		this.social_links = social_links;
		this.topic = topic;
		this.organizer_description = organizer_description;
		this.email = email;
		this.type = type;
		this.logo = logo;
		this._version = version;
		this.privacy = privacy;
		this.code_of_conduct = code_of_conduct;
		this.state = state;
		this.timezone = timezone;
		this.start_time = start_time;
		this.id = id;
		this._copyright = copyright;
		this._call_for_papers = call_for_papers;
		this.name = name;
		this.description = description;
		this.location_name = location_name;
		this._creator = creator;

	}

}