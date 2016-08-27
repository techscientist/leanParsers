import java.util.ArrayList;

class RootModel {

	public String description;
	public String code_of_conduct;
	public VersionModel _version;
	public String location_name;
	public String logo;
	public String email;
	public String privacy;
	public String type;
	public String name;
	public String state;
	public String background_image;
	public CreatorModel _creator;
	public String end_time;
	public Call_for_papersModel _call_for_papers;
	public String timezone;
	public int id;
	public String organizer_name;
	public String start_time;
	public String topic;
	public ArrayList<Social_linksModel> social_links;
	public String schedule_published_on;
	public CopyrightModel _copyright;
	public String organizer_description;

	public RootModel(String description, String code_of_conduct, VersionModel version, String location_name, String logo, String email, String privacy, String type, String name, String state, String background_image, CreatorModel creator, String end_time, Call_for_papersModel call_for_papers, String timezone, int id, String organizer_name, String start_time, String topic, ArrayList<Social_linksModel> social_links, String schedule_published_on, CopyrightModel copyright, String organizer_description) {

		this.description = description;
		this.code_of_conduct = code_of_conduct;
		this._version = version;
		this.location_name = location_name;
		this.logo = logo;
		this.email = email;
		this.privacy = privacy;
		this.type = type;
		this.name = name;
		this.state = state;
		this.background_image = background_image;
		this._creator = creator;
		this.end_time = end_time;
		this._call_for_papers = call_for_papers;
		this.timezone = timezone;
		this.id = id;
		this.organizer_name = organizer_name;
		this.start_time = start_time;
		this.topic = topic;
		this.social_links = social_links;
		this.schedule_published_on = schedule_published_on;
		this._copyright = copyright;
		this.organizer_description = organizer_description;

	}

}