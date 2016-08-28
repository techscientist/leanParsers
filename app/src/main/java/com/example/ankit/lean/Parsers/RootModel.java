import java.util.ArrayList;

class RootModel {

	public VersionModel _version;
	public int id;
	public String state;
	public String location_name;
	public String organizer_name;
	public String code_of_conduct;
	public String type;
	public String background_image;
	public CopyrightModel _copyright;
	public String privacy;
	public Call_for_papersModel _call_for_papers;
	public String organizer_description;
	public String email;
	public String start_time;
	public String logo;
	public String description;
	public CreatorModel _creator;
	public ArrayList<Social_linksModel> social_links;
	public String schedule_published_on;
	public String name;
	public String topic;
	public String end_time;
	public String timezone;

	public RootModel(VersionModel version, int id, String state, String location_name, String organizer_name, String code_of_conduct, String type, String background_image, CopyrightModel copyright, String privacy, Call_for_papersModel call_for_papers, String organizer_description, String email, String start_time, String logo, String description, CreatorModel creator, ArrayList<Social_linksModel> social_links, String schedule_published_on, String name, String topic, String end_time, String timezone) {

		this._version = version;
		this.id = id;
		this.state = state;
		this.location_name = location_name;
		this.organizer_name = organizer_name;
		this.code_of_conduct = code_of_conduct;
		this.type = type;
		this.background_image = background_image;
		this._copyright = copyright;
		this.privacy = privacy;
		this._call_for_papers = call_for_papers;
		this.organizer_description = organizer_description;
		this.email = email;
		this.start_time = start_time;
		this.logo = logo;
		this.description = description;
		this._creator = creator;
		this.social_links = social_links;
		this.schedule_published_on = schedule_published_on;
		this.name = name;
		this.topic = topic;
		this.end_time = end_time;
		this.timezone = timezone;

	}

}