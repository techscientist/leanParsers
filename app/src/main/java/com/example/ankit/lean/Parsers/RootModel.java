import java.util.ArrayList;

class RootModel {

	public CreatorModel _creator;
	public String timezone;
	public String description;
	public String email;
	public String logo;
	public String organizer_description;
	public String code_of_conduct;
	public String background_image;
	public String schedule_published_on;
	public String privacy;
	public ArrayList<Social_linksModel> social_links;
	public String organizer_name;
	public CopyrightModel _copyright;
	public int id;
	public String start_time;
	public String topic;
	public String name;
	public String location_name;
	public VersionModel _version;
	public Call_for_papersModel _call_for_papers;
	public String end_time;
	public String state;
	public String type;

	public RootModel(CreatorModel creator, String timezone, String description, String email, String logo, String organizer_description, String code_of_conduct, String background_image, String schedule_published_on, String privacy, ArrayList<Social_linksModel> social_links, String organizer_name, CopyrightModel copyright, int id, String start_time, String topic, String name, String location_name, VersionModel version, Call_for_papersModel call_for_papers, String end_time, String state, String type) {

		this._creator = creator;
		this.timezone = timezone;
		this.description = description;
		this.email = email;
		this.logo = logo;
		this.organizer_description = organizer_description;
		this.code_of_conduct = code_of_conduct;
		this.background_image = background_image;
		this.schedule_published_on = schedule_published_on;
		this.privacy = privacy;
		this.social_links = social_links;
		this.organizer_name = organizer_name;
		this._copyright = copyright;
		this.id = id;
		this.start_time = start_time;
		this.topic = topic;
		this.name = name;
		this.location_name = location_name;
		this._version = version;
		this._call_for_papers = call_for_papers;
		this.end_time = end_time;
		this.state = state;
		this.type = type;

	}

}