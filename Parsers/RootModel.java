import java.util.ArrayList;

class RootModel {

	public String organizer_description;
	public ArrayList<Social_linksModel> social_links;
	public String privacy;
	public String location_name;
	public String organizer_name;
	public String code_of_conduct;
	public CopyrightModel _copyright;
	public String name;
	public int id;
	public String topic;
	public String timezone;
	public VersionModel _version;
	public String type;
	public String logo;
	public String background_image;
	public String end_time;
	public String start_time;
	public Call_for_papersModel _call_for_papers;
	public String state;
	public String schedule_published_on;
	public String description;
	public String email;
	public CreatorModel _creator;

	public RootModel(String organizer_description, ArrayList<Social_linksModel> social_links, String privacy, String location_name, String organizer_name, String code_of_conduct, CopyrightModel copyright, String name, int id, String topic, String timezone, VersionModel version, String type, String logo, String background_image, String end_time, String start_time, Call_for_papersModel call_for_papers, String state, String schedule_published_on, String description, String email, CreatorModel creator) {

		this.organizer_description = organizer_description;
		this.social_links = social_links;
		this.privacy = privacy;
		this.location_name = location_name;
		this.organizer_name = organizer_name;
		this.code_of_conduct = code_of_conduct;
		this._copyright = copyright;
		this.name = name;
		this.id = id;
		this.topic = topic;
		this.timezone = timezone;
		this._version = version;
		this.type = type;
		this.logo = logo;
		this.background_image = background_image;
		this.end_time = end_time;
		this.start_time = start_time;
		this._call_for_papers = call_for_papers;
		this.state = state;
		this.schedule_published_on = schedule_published_on;
		this.description = description;
		this.email = email;
		this._creator = creator;

	}

}