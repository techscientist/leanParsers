import java.util.ArrayList;

class RootModel {

	public CreatorModel _creator;
	public ArrayList<Social_linksModel> social_links;
	public String code_of_conduct;
	public String end_time;
	public String description;
	public String topic;
	public String logo;
	public String location_name;
	public String background_image;
	public CopyrightModel _copyright;
	public String timezone;
	public String state;
	public String email;
	public int id;
	public String schedule_published_on;
	public Call_for_papersModel _call_for_papers;
	public String organizer_name;
	public String privacy;
	public String organizer_description;
	public String start_time;
	public VersionModel _version;
	public String type;
	public String name;

	public RootModel(CreatorModel creator, ArrayList<Social_linksModel> social_links, String code_of_conduct, String end_time, String description, String topic, String logo, String location_name, String background_image, CopyrightModel copyright, String timezone, String state, String email, int id, String schedule_published_on, Call_for_papersModel call_for_papers, String organizer_name, String privacy, String organizer_description, String start_time, VersionModel version, String type, String name) {

		this._creator = creator;
		this.social_links = social_links;
		this.code_of_conduct = code_of_conduct;
		this.end_time = end_time;
		this.description = description;
		this.topic = topic;
		this.logo = logo;
		this.location_name = location_name;
		this.background_image = background_image;
		this._copyright = copyright;
		this.timezone = timezone;
		this.state = state;
		this.email = email;
		this.id = id;
		this.schedule_published_on = schedule_published_on;
		this._call_for_papers = call_for_papers;
		this.organizer_name = organizer_name;
		this.privacy = privacy;
		this.organizer_description = organizer_description;
		this.start_time = start_time;
		this._version = version;
		this.type = type;
		this.name = name;

	}

}