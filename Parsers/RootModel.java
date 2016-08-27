import java.util.ArrayList;

class RootModel {

	public String topic;
	public String start_time;
	public int id;
	public CopyrightModel _copyright;
	public String state;
	public VersionModel _version;
	public String description;
	public String location_name;
	public String code_of_conduct;
	public String logo;
	public ArrayList<Social_linksModel> social_links;
	public String name;
	public String background_image;
	public String timezone;
	public String organizer_name;
	public String type;
	public Call_for_papersModel _call_for_papers;
	public String email;
	public String schedule_published_on;
	public String organizer_description;
	public String privacy;
	public String end_time;
	public CreatorModel _creator;

	public RootModel(String topic, String start_time, int id, CopyrightModel copyright, String state, VersionModel version, String description, String location_name, String code_of_conduct, String logo, ArrayList<Social_linksModel> social_links, String name, String background_image, String timezone, String organizer_name, String type, Call_for_papersModel call_for_papers, String email, String schedule_published_on, String organizer_description, String privacy, String end_time, CreatorModel creator) {

		this.topic = topic;
		this.start_time = start_time;
		this.id = id;
		this._copyright = copyright;
		this.state = state;
		this._version = version;
		this.description = description;
		this.location_name = location_name;
		this.code_of_conduct = code_of_conduct;
		this.logo = logo;
		this.social_links = social_links;
		this.name = name;
		this.background_image = background_image;
		this.timezone = timezone;
		this.organizer_name = organizer_name;
		this.type = type;
		this._call_for_papers = call_for_papers;
		this.email = email;
		this.schedule_published_on = schedule_published_on;
		this.organizer_description = organizer_description;
		this.privacy = privacy;
		this.end_time = end_time;
		this._creator = creator;

	}

}