import java.util.ArrayList;

class RootModel {

	public String end_time;
	public String schedule_published_on;
	public CopyrightModel _copyright;
	public int id;
	public String code_of_conduct;
	public String organizer_description;
	public String timezone;
	public String email;
	public String organizer_name;
	public String location_name;
	public String name;
	public Call_for_papersModel _call_for_papers;
	public String logo;
	public String topic;
	public String privacy;
	public String description;
	public String background_image;
	public VersionModel _version;
	public ArrayList<Social_linksModel> social_links;
	public String type;
	public String start_time;
	public String state;
	public CreatorModel _creator;

	public RootModel(String end_time, String schedule_published_on, CopyrightModel copyright, int id, String code_of_conduct, String organizer_description, String timezone, String email, String organizer_name, String location_name, String name, Call_for_papersModel call_for_papers, String logo, String topic, String privacy, String description, String background_image, VersionModel version, ArrayList<Social_linksModel> social_links, String type, String start_time, String state, CreatorModel creator) {

		this.end_time = end_time;
		this.schedule_published_on = schedule_published_on;
		this._copyright = copyright;
		this.id = id;
		this.code_of_conduct = code_of_conduct;
		this.organizer_description = organizer_description;
		this.timezone = timezone;
		this.email = email;
		this.organizer_name = organizer_name;
		this.location_name = location_name;
		this.name = name;
		this._call_for_papers = call_for_papers;
		this.logo = logo;
		this.topic = topic;
		this.privacy = privacy;
		this.description = description;
		this.background_image = background_image;
		this._version = version;
		this.social_links = social_links;
		this.type = type;
		this.start_time = start_time;
		this.state = state;
		this._creator = creator;

	}

}