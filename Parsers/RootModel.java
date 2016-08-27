import java.util.ArrayList;

class RootModel {

	public String privacy;
	public String timezone;
	public String location_name;
	public int id;
	public String name;
	public CopyrightModel _copyright;
	public String logo;
	public String background_image;
	public String schedule_published_on;
	public String code_of_conduct;
	public String type;
	public String state;
	public String email;
	public String description;
	public String start_time;
	public String organizer_name;
	public ArrayList<Social_linksModel> social_links;
	public String topic;
	public String organizer_description;
	public VersionModel _version;
	public String end_time;
	public Call_for_papersModel _call_for_papers;
	public CreatorModel _creator;

	public RootModel(String privacy, String timezone, String location_name, int id, String name, CopyrightModel copyright, String logo, String background_image, String schedule_published_on, String code_of_conduct, String type, String state, String email, String description, String start_time, String organizer_name, ArrayList<Social_linksModel> social_links, String topic, String organizer_description, VersionModel version, String end_time, Call_for_papersModel call_for_papers, CreatorModel creator) {

		this.privacy = privacy;
		this.timezone = timezone;
		this.location_name = location_name;
		this.id = id;
		this.name = name;
		this._copyright = copyright;
		this.logo = logo;
		this.background_image = background_image;
		this.schedule_published_on = schedule_published_on;
		this.code_of_conduct = code_of_conduct;
		this.type = type;
		this.state = state;
		this.email = email;
		this.description = description;
		this.start_time = start_time;
		this.organizer_name = organizer_name;
		this.social_links = social_links;
		this.topic = topic;
		this.organizer_description = organizer_description;
		this._version = version;
		this.end_time = end_time;
		this._call_for_papers = call_for_papers;
		this._creator = creator;

	}

}