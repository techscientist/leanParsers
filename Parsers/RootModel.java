import java.util.ArrayList;

class RootModel {

	public String location_name;
	public String type;
	public String organizer_name;
	public Call_for_papersModel _call_for_papers;
	public String email;
	public String code_of_conduct;
	public String start_time;
	public String description;
	public CopyrightModel _copyright;
	public String name;
	public String organizer_description;
	public String topic;
	public String privacy;
	public VersionModel _version;
	public String end_time;
	public String timezone;
	public String logo;
	public String background_image;
	public String schedule_published_on;
	public String state;
	public int id;
	public ArrayList<Social_linksModel> social_links;
	public CreatorModel _creator;

	public RootModel(String location_name, String type, String organizer_name, Call_for_papersModel call_for_papers, String email, String code_of_conduct, String start_time, String description, CopyrightModel copyright, String name, String organizer_description, String topic, String privacy, VersionModel version, String end_time, String timezone, String logo, String background_image, String schedule_published_on, String state, int id, ArrayList<Social_linksModel> social_links, CreatorModel creator) {

		this.location_name = location_name;
		this.type = type;
		this.organizer_name = organizer_name;
		this._call_for_papers = call_for_papers;
		this.email = email;
		this.code_of_conduct = code_of_conduct;
		this.start_time = start_time;
		this.description = description;
		this._copyright = copyright;
		this.name = name;
		this.organizer_description = organizer_description;
		this.topic = topic;
		this.privacy = privacy;
		this._version = version;
		this.end_time = end_time;
		this.timezone = timezone;
		this.logo = logo;
		this.background_image = background_image;
		this.schedule_published_on = schedule_published_on;
		this.state = state;
		this.id = id;
		this.social_links = social_links;
		this._creator = creator;

	}

}